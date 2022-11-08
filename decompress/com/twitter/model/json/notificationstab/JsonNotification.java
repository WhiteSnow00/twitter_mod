// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.HashMap;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotification extends lhh<api>
{
    @JsonField
    public String a;
    @JsonField
    public JsonNotification.JsonNotification$Template b;
    @JsonField
    public xri c;
    @JsonField
    public xwm d;
    
    @Override
    public final h4j t() {
        final api.a a = new api.a();
        a.a = this.a;
        a.d = this.c;
        a.e = this.d;
        final JsonNotification.JsonNotification$Template b = this.b;
        final fri fri = null;
        xti xti = null;
        xwm a3 = null;
        Label_0082: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a2 = b.a;
                if (a2 != null) {
                    final JsonNotification.JsonNotification$AdditionalContext c = a2.c;
                    if (c != null) {
                        a3 = c.a;
                        break Label_0082;
                    }
                }
            }
            a3 = null;
        }
        a.f = a3;
        String d = null;
        Label_0116: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a4 = b.a;
                if (a4 != null) {
                    d = a4.d;
                    break Label_0116;
                }
            }
            d = null;
        }
        a.g = d;
        Object o = null;
        Label_0162: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a5 = b.a;
                if (a5 != null) {
                    o = a5.a;
                    if (o != null) {
                        break Label_0162;
                    }
                }
            }
            o = ced.D0;
            final int a6 = w4j.a;
        }
        a.b = hr4.c((List)o, (kub)tp3.u);
        final HashMap<UserIdentifier, zyl> c2 = new HashMap<UserIdentifier, zyl>();
        final JsonNotification.JsonNotification$Template b2 = this.b;
        Object o2 = null;
        Label_0230: {
            if (b2 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a7 = b2.a;
                if (a7 != null) {
                    o2 = a7.a;
                    if (o2 != null) {
                        break Label_0230;
                    }
                }
            }
            o2 = ced.D0;
            final int a8 = w4j.a;
        }
        final Iterator iterator = ((List)o2).iterator();
        while (iterator.hasNext()) {
            final a t = ((JsonNotification.JsonNotification$UserContainer)iterator.next()).a.t();
            if (t.a.isRegularUser()) {
                final zyl b3 = t.b;
                if (b3 == zyl.I0) {
                    continue;
                }
                c2.put(t.a, b3);
            }
        }
        a.c = c2;
        final JsonNotification.JsonNotification$Template b4 = this.b;
        long a9;
        final long n = a9 = -1L;
        if (b4 != null) {
            final JsonNotification.JsonNotification$AggregatesUserActionsV1 a10 = b4.a;
            if (a10 == null) {
                a9 = n;
            }
            else {
                final JsonNotification.JsonNotification$TargetObject jsonNotification$TargetObject = (JsonNotification.JsonNotification$TargetObject)hr4.q((List)a10.b);
                JsonNotification.JsonNotification$TargetObjectTweet a11;
                if (jsonNotification$TargetObject == null) {
                    a11 = null;
                }
                else {
                    a11 = jsonNotification$TargetObject.a;
                }
                if (a11 == null) {
                    a9 = n;
                }
                else {
                    a9 = a11.a;
                }
            }
        }
        a.k = a9;
        final JsonNotification.JsonNotification$Template b5 = this.b;
        String b6 = null;
        Label_0483: {
            if (b5 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a12 = b5.a;
                if (a12 != null) {
                    final JsonNotification.JsonNotification$TargetObject jsonNotification$TargetObject2 = (JsonNotification.JsonNotification$TargetObject)hr4.q((List)a12.b);
                    if (jsonNotification$TargetObject2 != null) {
                        final JsonNotification.JsonNotification$TargetObjectTweet a13 = jsonNotification$TargetObject2.a;
                        if (a13 != null) {
                            b6 = a13.b;
                            if (b6 != null) {
                                break Label_0483;
                            }
                        }
                    }
                }
            }
            b6 = "None";
        }
        a.l = b6;
        final JsonNotification.JsonNotification$Template b7 = this.b;
        ovv e = null;
        Label_0522: {
            if (b7 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a14 = b7.a;
                if (a14 != null) {
                    e = a14.e;
                    break Label_0522;
                }
            }
            e = null;
        }
        a.h = e;
        nsi i = null;
        Label_0612: {
            if (b7 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a15 = b7.a;
                if (a15 != null) {
                    final JsonNotification.JsonNotification$InlineFeedback f = a15.f;
                    if (f != null) {
                        i = new nsi(f.a, f.b, f.c.a, f.d.a, f.e.a, f.f.a);
                        break Label_0612;
                    }
                }
            }
            i = null;
        }
        a.i = i;
        final JsonNotification.JsonNotification$Template b8 = this.b;
        fri j = fri;
        if (b8 != null) {
            final JsonNotification.JsonNotification$AggregatesUserActionsV1 a16 = b8.a;
            j = fri;
            if (a16 != null) {
                final JsonNotification.JsonNotification$DisplayOptions g = a16.g;
                j = fri;
                if (g != null) {
                    final boolean b9 = g.a != null;
                    final JsonNotification.JsonNotification$MediaPreview b10 = g.b;
                    nti nti;
                    if (b10 != null) {
                        nti = new nti(b10.a);
                    }
                    else {
                        nti = null;
                    }
                    final JsonNotification.JsonNotification$QuoteTweet c3 = this.b.a.g.c;
                    if (c3 != null) {
                        xti = new xti(c3.a);
                    }
                    j = new fri(b9, nti, xti);
                }
            }
        }
        a.j = j;
        return a;
    }
}
