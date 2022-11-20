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
public class JsonNotification extends qhh<fpi>
{
    @JsonField
    public String a;
    @JsonField
    public JsonNotification.JsonNotification$Template b;
    @JsonField
    public zri c;
    @JsonField
    public oxm d;
    
    public final n4j t() {
        final fpi$a fpi$a = new fpi$a();
        fpi$a.a = this.a;
        fpi$a.d = this.c;
        fpi$a.e = this.d;
        final JsonNotification.JsonNotification$Template b = this.b;
        final hri hri = null;
        yti yti = null;
        oxm a2 = null;
        Label_0090: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a = b.a;
                if (a != null) {
                    final JsonNotification.JsonNotification$AdditionalContext c = a.c;
                    if (c != null) {
                        a2 = c.a;
                        break Label_0090;
                    }
                }
            }
            a2 = null;
        }
        fpi$a.f = a2;
        String d = null;
        Label_0127: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a3 = b.a;
                if (a3 != null) {
                    d = a3.d;
                    break Label_0127;
                }
            }
            d = null;
        }
        fpi$a.g = d;
        Object o = null;
        Label_0175: {
            if (b != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a4 = b.a;
                if (a4 != null) {
                    o = a4.a;
                    if (o != null) {
                        break Label_0175;
                    }
                }
            }
            o = gdd.E0;
            final int a5 = c5j.a;
        }
        fpi$a.b = fq4.c((List)o, (jtb)vq9.r);
        final HashMap<UserIdentifier, ozl> c2 = new HashMap<UserIdentifier, ozl>();
        final JsonNotification.JsonNotification$Template b2 = this.b;
        Object o2 = null;
        Label_0244: {
            if (b2 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a6 = b2.a;
                if (a6 != null) {
                    o2 = a6.a;
                    if (o2 != null) {
                        break Label_0244;
                    }
                }
            }
            o2 = gdd.E0;
            final int a7 = c5j.a;
        }
        final Iterator iterator = ((List)o2).iterator();
        while (iterator.hasNext()) {
            final a t = ((JsonNotification.JsonNotification$UserContainer)iterator.next()).a.t();
            if (t.a.isRegularUser()) {
                final ozl b3 = t.b;
                if (b3 == ozl.J0) {
                    continue;
                }
                c2.put(t.a, b3);
            }
        }
        fpi$a.c = c2;
        final JsonNotification.JsonNotification$Template b4 = this.b;
        long a8;
        final long n = a8 = -1L;
        if (b4 != null) {
            final JsonNotification.JsonNotification$AggregatesUserActionsV1 a9 = b4.a;
            if (a9 == null) {
                a8 = n;
            }
            else {
                final JsonNotification.JsonNotification$TargetObject jsonNotification$TargetObject = (JsonNotification.JsonNotification$TargetObject)fq4.q((List)a9.b);
                JsonNotification.JsonNotification$TargetObjectTweet a10;
                if (jsonNotification$TargetObject == null) {
                    a10 = null;
                }
                else {
                    a10 = jsonNotification$TargetObject.a;
                }
                if (a10 == null) {
                    a8 = n;
                }
                else {
                    a8 = a10.a;
                }
            }
        }
        fpi$a.k = a8;
        final JsonNotification.JsonNotification$Template b5 = this.b;
        String b6 = null;
        Label_0496: {
            if (b5 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a11 = b5.a;
                if (a11 != null) {
                    final JsonNotification.JsonNotification$TargetObject jsonNotification$TargetObject2 = (JsonNotification.JsonNotification$TargetObject)fq4.q((List)a11.b);
                    if (jsonNotification$TargetObject2 != null) {
                        final JsonNotification.JsonNotification$TargetObjectTweet a12 = jsonNotification$TargetObject2.a;
                        if (a12 != null) {
                            b6 = a12.b;
                            if (b6 != null) {
                                break Label_0496;
                            }
                        }
                    }
                }
            }
            b6 = "None";
        }
        fpi$a.l = b6;
        final JsonNotification.JsonNotification$Template b7 = this.b;
        hwv e = null;
        Label_0539: {
            if (b7 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a13 = b7.a;
                if (a13 != null) {
                    e = a13.e;
                    break Label_0539;
                }
            }
            e = null;
        }
        fpi$a.h = e;
        psi i = null;
        Label_0632: {
            if (b7 != null) {
                final JsonNotification.JsonNotification$AggregatesUserActionsV1 a14 = b7.a;
                if (a14 != null) {
                    final JsonNotification.JsonNotification$InlineFeedback f = a14.f;
                    if (f != null) {
                        i = new psi(f.a, f.b, f.c.a, f.d.a, f.e.a, f.f.a);
                        break Label_0632;
                    }
                }
            }
            i = null;
        }
        fpi$a.i = i;
        final JsonNotification.JsonNotification$Template b8 = this.b;
        hri j = hri;
        if (b8 != null) {
            final JsonNotification.JsonNotification$AggregatesUserActionsV1 a15 = b8.a;
            j = hri;
            if (a15 != null) {
                final JsonNotification.JsonNotification$DisplayOptions g = a15.g;
                j = hri;
                if (g != null) {
                    final boolean b9 = g.a != null;
                    final JsonNotification.JsonNotification$MediaPreview b10 = g.b;
                    pti pti;
                    if (b10 != null) {
                        pti = new pti(b10.a);
                    }
                    else {
                        pti = null;
                    }
                    final JsonNotification.JsonNotification$QuoteTweet c3 = this.b.a.g.c;
                    if (c3 != null) {
                        yti = new yti(c3.a);
                    }
                    j = new hri(b9, pti, yti);
                }
            }
        }
        fpi$a.j = j;
        return (n4j)fpi$a;
    }
}
