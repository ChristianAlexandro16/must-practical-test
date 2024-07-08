package technical.must.practical.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technical.must.practical.entity.JenisKonsumsiEntity;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JenisKonsumsiService {
    public ResponseEntity<List<JenisKonsumsiEntity>> getList() {
        List<JenisKonsumsiEntity> dataKonsumsi = generateDummy();

        return new ResponseEntity<>(dataKonsumsi, HttpStatus.OK);
    }

    private List<JenisKonsumsiEntity> generateDummy(){
        List<JenisKonsumsiEntity> data = new ArrayList<>();

        JenisKonsumsiEntity temp = new JenisKonsumsiEntity(1, "Snack Siang");
        data.add(temp);

        temp = new JenisKonsumsiEntity(2, "Makan Siang");
        data.add(temp);

        temp = new JenisKonsumsiEntity(3, "Snack Sore");
        data.add(temp);

        return data;
    }
}
