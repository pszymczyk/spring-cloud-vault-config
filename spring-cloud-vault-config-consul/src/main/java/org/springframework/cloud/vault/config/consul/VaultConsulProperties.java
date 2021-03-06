/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.vault.config.consul;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.vault.VaultSecretBackend;

import lombok.Data;

/**
 * Configuration properties for Hashicorp Consul.
 *
 * @author Mark Paluch
 */
@ConfigurationProperties("spring.cloud.vault.consul")
@Data
public class VaultConsulProperties implements VaultSecretBackend {

	/**
	 * Enable consul backend usage.
	 */
	private boolean enabled = false;

	/**
	 * Role name for credentials.
	 */
	private String role;

	/**
	 * Consul backend path.
	 */
	@NotEmpty
	private String backend = "consul";

	/**
	 * Target property for the obtained token.
	 */
	@NotEmpty
	private String tokenProperty = "spring.cloud.consul.token";
}