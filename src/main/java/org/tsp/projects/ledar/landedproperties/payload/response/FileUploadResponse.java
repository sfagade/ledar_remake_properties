package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class FileUploadResponse extends PayloadAbstractBase {

    private byte[] fileContent;
    private String fileName;
    private String fileType;
    private Boolean isDeleted;
    private Date deleteDate;
    private String fileSide;
    private String absolutePath;
    private String destroyerUsername;
    private String filePath;
}
