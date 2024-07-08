package technical.must.practical.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technical.must.practical.entity.JenisKonsumsiEntity;
import technical.must.practical.service.JenisKonsumsiService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/6686cb5583c983911b03a7f3.mockapi.io")
public class JenisKonsumsiController {
    private final JenisKonsumsiService jenisKonsumsiService;

    @GetMapping("/api/dummy-data/masterJenisKonsumsi")
    public ResponseEntity<List<JenisKonsumsiEntity>> getBookingList(){
        return jenisKonsumsiService.getList();
    }
}
