package io.curity.identityserver.plugin.train-ticket

import se.curity.identityserver.sdk.plugin.descriptor.EmailProviderPluginDescriptor

class train-ticketEmailProviderDescriptor: EmailProviderPluginDescriptor<train-ticketEmailProviderConfig>
{
    override fun getEmailSenderType() = train-ticketEmailSender::class.java

    override fun getPluginImplementationType() = "train-ticket"

    override fun getConfigurationType() = train-ticketEmailProviderConfig::class.java
}
