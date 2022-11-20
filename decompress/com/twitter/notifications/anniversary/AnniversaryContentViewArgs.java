// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.anniversary;

import kotlinx.serialization.descriptors.SerialDescriptor;
import android.os.Bundle;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&BM\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b \u0010!BU\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003JO\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006(" }, d2 = { "Lcom/twitter/notifications/anniversary/AnniversaryContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "title", "message", "action", "imageUrl", "text", "cursor", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILhlp;)V", "Companion", "$serializer", "subsystem.tfa.notifications.anniversary.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnniversaryContentViewArgs implements ContentViewArgs
{
    public static final AnniversaryContentViewArgs.AnniversaryContentViewArgs$Companion Companion;
    public final String action;
    public final int cursor;
    public final String imageUrl;
    public final String message;
    public final String text;
    public final String title;
    
    static {
        Companion = new AnniversaryContentViewArgs.AnniversaryContentViewArgs$Companion();
    }
    
    public AnniversaryContentViewArgs() {
        this(null, null, null, null, null, 0, 63, null);
    }
    
    public AnniversaryContentViewArgs(final int n, final String title, final String message, final String action, final String imageUrl, final String text, final int cursor, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.title = null;
            }
            else {
                this.title = title;
            }
            if ((n & 0x2) == 0x0) {
                this.message = null;
            }
            else {
                this.message = message;
            }
            if ((n & 0x4) == 0x0) {
                this.action = null;
            }
            else {
                this.action = action;
            }
            if ((n & 0x8) == 0x0) {
                this.imageUrl = null;
            }
            else {
                this.imageUrl = imageUrl;
            }
            if ((n & 0x10) == 0x0) {
                this.text = null;
            }
            else {
                this.text = text;
            }
            if ((n & 0x20) == 0x0) {
                this.cursor = 0;
            }
            else {
                this.cursor = cursor;
            }
            return;
        }
        blz.a0(n, 0, AnniversaryContentView.AnniversaryContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public AnniversaryContentViewArgs(final String title, final String message, final String action, final String imageUrl, final String text, final int cursor) {
        this.title = title;
        this.message = message;
        this.action = action;
        this.imageUrl = imageUrl;
        this.text = text;
        this.cursor = cursor;
    }
    
    public AnniversaryContentViewArgs(String s, String s2, String s3, String s4, String s5, int n, final int n2, final rf8 rf8) {
        final String s6 = null;
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n2 & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            s4 = null;
        }
        if ((n2 & 0x10) != 0x0) {
            s5 = s6;
        }
        if ((n2 & 0x20) != 0x0) {
            n = 0;
        }
        this(s, s2, s3, s4, s5, n);
    }
    
    public static AnniversaryContentViewArgs copy$default(final AnniversaryContentViewArgs anniversaryContentViewArgs, String title, String message, String action, String imageUrl, String text, int cursor, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            title = anniversaryContentViewArgs.title;
        }
        if ((n & 0x2) != 0x0) {
            message = anniversaryContentViewArgs.message;
        }
        if ((n & 0x4) != 0x0) {
            action = anniversaryContentViewArgs.action;
        }
        if ((n & 0x8) != 0x0) {
            imageUrl = anniversaryContentViewArgs.imageUrl;
        }
        if ((n & 0x10) != 0x0) {
            text = anniversaryContentViewArgs.text;
        }
        if ((n & 0x20) != 0x0) {
            cursor = anniversaryContentViewArgs.cursor;
        }
        return anniversaryContentViewArgs.copy(title, message, action, imageUrl, text, cursor);
    }
    
    public static final AnniversaryContentViewArgs fromDeepLinkBundleExtras(final Bundle bundle) {
        return AnniversaryContentViewArgs.Companion.a(bundle);
    }
    
    public static final void write$Self(final AnniversaryContentViewArgs anniversaryContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)anniversaryContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (anniversaryContentViewArgs.title == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)anniversaryContentViewArgs.title);
        }
        boolean b2 = false;
        Label_0098: {
            if (!xc6.z(serialDescriptor)) {
                if (anniversaryContentViewArgs.message == null) {
                    b2 = false;
                    break Label_0098;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.y(serialDescriptor, 1, (jlp)gkr.a, (Object)anniversaryContentViewArgs.message);
        }
        boolean b3 = false;
        Label_0144: {
            if (!xc6.z(serialDescriptor)) {
                if (anniversaryContentViewArgs.action == null) {
                    b3 = false;
                    break Label_0144;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.y(serialDescriptor, 2, (jlp)gkr.a, (Object)anniversaryContentViewArgs.action);
        }
        boolean b4 = false;
        Label_0190: {
            if (!xc6.z(serialDescriptor)) {
                if (anniversaryContentViewArgs.imageUrl == null) {
                    b4 = false;
                    break Label_0190;
                }
            }
            b4 = true;
        }
        if (b4) {
            xc6.y(serialDescriptor, 3, (jlp)gkr.a, (Object)anniversaryContentViewArgs.imageUrl);
        }
        boolean b5 = false;
        Label_0236: {
            if (!xc6.z(serialDescriptor)) {
                if (anniversaryContentViewArgs.text == null) {
                    b5 = false;
                    break Label_0236;
                }
            }
            b5 = true;
        }
        if (b5) {
            xc6.y(serialDescriptor, 4, (jlp)gkr.a, (Object)anniversaryContentViewArgs.text);
        }
        int n2 = 0;
        Label_0280: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (anniversaryContentViewArgs.cursor == 0) {
                    break Label_0280;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.Q(serialDescriptor, 5, anniversaryContentViewArgs.cursor);
        }
    }
    
    public final String component1() {
        return this.title;
    }
    
    public final String component2() {
        return this.message;
    }
    
    public final String component3() {
        return this.action;
    }
    
    public final String component4() {
        return this.imageUrl;
    }
    
    public final String component5() {
        return this.text;
    }
    
    public final int component6() {
        return this.cursor;
    }
    
    public final AnniversaryContentViewArgs copy(final String s, final String s2, final String s3, final String s4, final String s5, final int n) {
        return new AnniversaryContentViewArgs(s, s2, s3, s4, s5, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnniversaryContentViewArgs)) {
            return false;
        }
        final AnniversaryContentViewArgs anniversaryContentViewArgs = (AnniversaryContentViewArgs)o;
        return czd.a((Object)this.title, (Object)anniversaryContentViewArgs.title) && czd.a((Object)this.message, (Object)anniversaryContentViewArgs.message) && czd.a((Object)this.action, (Object)anniversaryContentViewArgs.action) && czd.a((Object)this.imageUrl, (Object)anniversaryContentViewArgs.imageUrl) && czd.a((Object)this.text, (Object)anniversaryContentViewArgs.text) && this.cursor == anniversaryContentViewArgs.cursor;
    }
    
    @Override
    public int hashCode() {
        final String title = this.title;
        int hashCode = 0;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        final String message = this.message;
        int hashCode3;
        if (message == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = message.hashCode();
        }
        final String action = this.action;
        int hashCode4;
        if (action == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = action.hashCode();
        }
        final String imageUrl = this.imageUrl;
        int hashCode5;
        if (imageUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = imageUrl.hashCode();
        }
        final String text = this.text;
        if (text != null) {
            hashCode = text.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31 + this.cursor;
    }
    
    @Override
    public String toString() {
        final String title = this.title;
        final String message = this.message;
        final String action = this.action;
        final String imageUrl = this.imageUrl;
        final String text = this.text;
        final int cursor = this.cursor;
        final StringBuilder q = tqf.q("AnniversaryContentViewArgs(title=", title, ", message=", message, ", action=");
        nb0.z(q, action, ", imageUrl=", imageUrl, ", text=");
        q.append(text);
        q.append(", cursor=");
        q.append(cursor);
        q.append(")");
        return q.toString();
    }
}
