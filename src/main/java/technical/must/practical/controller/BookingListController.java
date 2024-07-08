package technical.must.practical.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technical.must.practical.entity.BookingListEntity;
import technical.must.practical.service.BookingListService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/66876cc30bc7155dc017a6622.mockapi.io")
public class BookingListController {
    private final BookingListService bookingListService;

    @GetMapping("/api/dummy-data/bookingList")
    public ResponseEntity<List<BookingListEntity>> getBookingList(){
        return bookingListService.getList();
    }
}
