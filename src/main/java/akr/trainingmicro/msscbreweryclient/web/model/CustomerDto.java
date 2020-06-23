package akr.trainingmicro.msscbreweryclient.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CustomerDto {
	
	private UUID id;
	private String name;
	

}
