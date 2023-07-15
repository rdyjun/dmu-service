package dmucs.dmu.classroomreservation.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rental")
public class ClassroomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;
    @JoinColumn(name = "roomId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Classroom roomId;
    @Column(name = "rentalDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm", timezone = "Asia/Seoul")
    private Date date;
    @Column(name = "rentalType")
    private String type;
}
