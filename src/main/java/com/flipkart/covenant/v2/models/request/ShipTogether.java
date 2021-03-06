package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;

/**
 * Policy requiring listings to be shipped together from a source to the customer.
 */
@ApiModel(parent = Policy.class)
@JsonTypeName("SHIP_TOGETHER")
public class ShipTogether extends Policy {
}
