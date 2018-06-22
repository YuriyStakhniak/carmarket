package education.cursor.spring.carmarket.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Map;


@Getter
@Setter
@Builder
public class Response {

    private String message;
    @Singular
    private List<Map<String, Object>> infos;
}
