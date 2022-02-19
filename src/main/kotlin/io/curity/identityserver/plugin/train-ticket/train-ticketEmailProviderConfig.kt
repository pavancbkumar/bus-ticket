package io.curity.identityserver.plugin.train-ticket

import se.curity.identityserver.sdk.config.Configuration
import se.curity.identityserver.sdk.config.annotation.Description

interface train-ticketEmailProviderConfig: Configuration
{
    @Description("A parameter used for demo purposes")
    fun getDemoParameter(): Int
}
