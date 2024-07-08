package technical.must.practical.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "nama_ruangan")
public class BookingListEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @JsonProperty("nama_ruangan")
    private String namaRuangan;

    @JsonProperty("pemakaian")
    private double pemakaian;

    @JsonProperty("nominal_konsumsi")
    private int nominalKonsumsi;

    @JsonProperty("snack_siang")
    private int snackSiang;

    @JsonProperty("makan_siang")
    private int makanSiang;

    @JsonProperty("snack_sore")
    private int snacSore;
}
