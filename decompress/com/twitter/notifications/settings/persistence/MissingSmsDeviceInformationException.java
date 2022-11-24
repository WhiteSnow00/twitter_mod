// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.persistence;

public class MissingSmsDeviceInformationException extends Exception
{
    public MissingSmsDeviceInformationException() {
        super("The user does not have a phone number tied to their account.");
    }
}
