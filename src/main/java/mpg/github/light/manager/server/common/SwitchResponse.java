package mpg.github.light.manager.server.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SwitchResponse {
    int code;
    String desc;
}
