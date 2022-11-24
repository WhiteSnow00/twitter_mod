// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ocf.contacts.analytics;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class ContactsQueryStats$$JsonObjectMapper extends JsonMapper<ContactsQueryStats>
{
    public static ContactsQueryStats _parse(final qhe qhe) throws IOException {
        final ContactsQueryStats contactsQueryStats = new ContactsQueryStats();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(contactsQueryStats, d, qhe);
            qhe.m0();
        }
        return contactsQueryStats;
    }
    
    public static void _serialize(final ContactsQueryStats contactsQueryStats, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("noHasCustomRingtone", contactsQueryStats.e);
        yfe.W("noHasEmail", contactsQueryStats.h);
        yfe.W("noHasEventDates", contactsQueryStats.m);
        yfe.W("noHasNickname", contactsQueryStats.i);
        yfe.W("noHasPhone", contactsQueryStats.g);
        yfe.W("noHasPhoto", contactsQueryStats.j);
        yfe.W("noHasPostal", contactsQueryStats.l);
        yfe.W("noHasRelation", contactsQueryStats.k);
        yfe.W("noIsPinned", contactsQueryStats.d);
        yfe.W("noIsStarred", contactsQueryStats.c);
        yfe.W("noOfContacts", contactsQueryStats.b);
        yfe.W("noOfRows", contactsQueryStats.a);
        yfe.W("noSentToVoicemail", contactsQueryStats.f);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final ContactsQueryStats contactsQueryStats, final String s, final qhe qhe) throws IOException {
        if ("noHasCustomRingtone".equals(s)) {
            contactsQueryStats.e = qhe.L();
        }
        else if ("noHasEmail".equals(s)) {
            contactsQueryStats.h = qhe.L();
        }
        else if ("noHasEventDates".equals(s)) {
            contactsQueryStats.m = qhe.L();
        }
        else if ("noHasNickname".equals(s)) {
            contactsQueryStats.i = qhe.L();
        }
        else if ("noHasPhone".equals(s)) {
            contactsQueryStats.g = qhe.L();
        }
        else if ("noHasPhoto".equals(s)) {
            contactsQueryStats.j = qhe.L();
        }
        else if ("noHasPostal".equals(s)) {
            contactsQueryStats.l = qhe.L();
        }
        else if ("noHasRelation".equals(s)) {
            contactsQueryStats.k = qhe.L();
        }
        else if ("noIsPinned".equals(s)) {
            contactsQueryStats.d = qhe.L();
        }
        else if ("noIsStarred".equals(s)) {
            contactsQueryStats.c = qhe.L();
        }
        else if ("noOfContacts".equals(s)) {
            contactsQueryStats.b = qhe.L();
        }
        else if ("noOfRows".equals(s)) {
            contactsQueryStats.a = qhe.L();
        }
        else if ("noSentToVoicemail".equals(s)) {
            contactsQueryStats.f = qhe.L();
        }
    }
    
    public ContactsQueryStats parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final ContactsQueryStats contactsQueryStats, final yfe yfe, final boolean b) throws IOException {
        _serialize(contactsQueryStats, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((ContactsQueryStats)o, yfe, b);
    }
}
