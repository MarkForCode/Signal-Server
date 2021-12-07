/*
 * Copyright 2013-2021 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.textsecuregcm.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class BaseProfileResponse {

  @JsonProperty
  private String identityKey;

  @JsonProperty
  private String unidentifiedAccess;

  @JsonProperty
  private boolean unrestrictedUnidentifiedAccess;

  @JsonProperty
  private UserCapabilities capabilities;

  @JsonProperty
  private List<Badge> badges;

  @JsonProperty
  private String username;

  @JsonProperty
  private UUID uuid;

  public BaseProfileResponse() {
  }

  public BaseProfileResponse(final String identityKey,
      final String unidentifiedAccess,
      final boolean unrestrictedUnidentifiedAccess,
      final UserCapabilities capabilities,
      final List<Badge> badges,
      @Nullable final String username,
      final UUID uuid) {

    this.identityKey = identityKey;
    this.unidentifiedAccess = unidentifiedAccess;
    this.unrestrictedUnidentifiedAccess = unrestrictedUnidentifiedAccess;
    this.capabilities = capabilities;
    this.badges = badges;
    this.username = username;
    this.uuid = uuid;
  }

  public String getIdentityKey() {
    return identityKey;
  }

  public String getUnidentifiedAccess() {
    return unidentifiedAccess;
  }

  public boolean isUnrestrictedUnidentifiedAccess() {
    return unrestrictedUnidentifiedAccess;
  }

  public UserCapabilities getCapabilities() {
    return capabilities;
  }

  public List<Badge> getBadges() {
    return badges;
  }

  public String getUsername() {
    return username;
  }

  public UUID getUuid() {
    return uuid;
  }
}
