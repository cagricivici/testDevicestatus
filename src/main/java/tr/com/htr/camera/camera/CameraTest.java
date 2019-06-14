package tr.com.htr.camera.camera;


import com.sun.deploy.xml.GeneralEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "cameraStatus")
public class CameraTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @SequenceGenerator(
            name="camera_generator",
            sequenceName="camera_seq"
    )private long id;

    @Column(columnDefinition = "character varying(250)", name = "camera_name", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String cameraName; //camera model

    @Column(columnDefinition = "character varying(250)", name = "camera_description", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String cameraDesc; //camera description



    @Column(columnDefinition = "character varying(250)", name = "camera_revision", nullable = false)
    @Getter
    @Setter
    private String cameraRev; //camera revision

    @Column(columnDefinition = "character varying(250)", name = "camera_SN", nullable = false)
    @Getter
    @Setter
    private String cameraSerialNO; //camera serialno

    @Column(columnDefinition = "character varying(250)", name = "camera_ip", nullable = false)
    @Getter
    @Setter
    private String cameraIP; //camera IP


    @Column(columnDefinition = "boolean", name = "online_offline", nullable = false)
    @Getter
    @Setter
    private boolean cameraPass;

}
