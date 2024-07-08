package technical.must.practical.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technical.must.practical.entity.BookingListEntity;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingListService {
    public ResponseEntity<List<BookingListEntity>> getList() {
        List<BookingListEntity> dataRoom = generateDummy();

        return new ResponseEntity<>(dataRoom, HttpStatus.OK);
    }

    private List<BookingListEntity> generateDummy(){
        List<BookingListEntity> data = new ArrayList<>();

        BookingListEntity temp = new BookingListEntity(1, "Regular1", 70.12,
                15000000, 140, 250, 140);
        data.add(temp);

        temp = new BookingListEntity(2, "Regular2", 83.55,
                17000000, 170, 320, 170);
        data.add(temp);

        temp = new BookingListEntity(3, "VIP1", 75.88,
                27000000, 200, 500, 180);
        data.add(temp);

        temp = new BookingListEntity(4, "VIP21", 90.34,
                20000000, 230, 550, 200);
        data.add(temp);

        return data;
    }
}
