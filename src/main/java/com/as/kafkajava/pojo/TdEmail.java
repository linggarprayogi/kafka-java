package com.as.kafkajava.pojo;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TdEmail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 507260388618098166L;

	private UUID              idEmail;

	private Integer           idFilter;

	private String            email;

	private String            flagStatus;

}
