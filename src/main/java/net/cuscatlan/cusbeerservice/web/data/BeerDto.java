package net.cuscatlan.cusbeerservice.web.data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
	
	private UUID beerId;
	private Integer version;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;
	
	private BeerStyleEnum beerStyle;
	
	private BigDecimal price;
	private Integer upc;
	private Integer quantityOnHand;
	
	
	

}
