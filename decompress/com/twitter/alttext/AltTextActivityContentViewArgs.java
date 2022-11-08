// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.alttext;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'B=\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006." }, d2 = { "Lcom/twitter/alttext/AltTextActivityContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lrw9;", "component1", "Lnw9;", "component2", "", "component3", "editableImage", "editableGif", "altText", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAltText", "()Ljava/lang/String;", "Lrw9;", "getEditableImage", "()Lrw9;", "getEditableImage$annotations", "()V", "Lnw9;", "getEditableGif", "()Lnw9;", "getEditableGif$annotations", "<init>", "(Lrw9;Lnw9;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILrw9;Lnw9;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.alttext.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class AltTextActivityContentViewArgs implements ContentViewArgs
{
    public static final AltTextActivityContentViewArgs.AltTextActivityContentViewArgs$Companion Companion;
    private final String altText;
    private final nw9 editableGif;
    private final rw9 editableImage;
    
    static {
        Companion = new AltTextActivityContentViewArgs.AltTextActivityContentViewArgs$Companion();
    }
    
    public AltTextActivityContentViewArgs() {
        this(null, null, null, 7, null);
    }
    
    public AltTextActivityContentViewArgs(final rw9 editableImage, final nw9 editableGif, final String altText) {
        this.editableImage = editableImage;
        this.editableGif = editableGif;
        this.altText = altText;
    }
    
    public static final void write$Self(final AltTextActivityContentViewArgs altTextActivityContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)altTextActivityContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = sd6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (altTextActivityContentViewArgs.editableImage == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            sd6.x(serialDescriptor, 0, (skp)uw9.b, (Object)altTextActivityContentViewArgs.editableImage);
        }
        boolean b2 = false;
        Label_0101: {
            if (!sd6.z(serialDescriptor)) {
                if (altTextActivityContentViewArgs.editableGif == null) {
                    b2 = false;
                    break Label_0101;
                }
            }
            b2 = true;
        }
        if (b2) {
            sd6.x(serialDescriptor, 1, (skp)ow9.b, (Object)altTextActivityContentViewArgs.editableGif);
        }
        int n2 = 0;
        Label_0148: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (altTextActivityContentViewArgs.altText == null) {
                    break Label_0148;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 2, (skp)njr.a, (Object)altTextActivityContentViewArgs.altText);
        }
    }
    
    public final rw9 component1() {
        return this.editableImage;
    }
    
    public final nw9 component2() {
        return this.editableGif;
    }
    
    public final String component3() {
        return this.altText;
    }
    
    public final AltTextActivityContentViewArgs copy(final rw9 rw9, final nw9 nw9, final String s) {
        return new AltTextActivityContentViewArgs(rw9, nw9, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AltTextActivityContentViewArgs)) {
            return false;
        }
        final AltTextActivityContentViewArgs altTextActivityContentViewArgs = (AltTextActivityContentViewArgs)o;
        return zzd.a((Object)this.editableImage, (Object)altTextActivityContentViewArgs.editableImage) && zzd.a((Object)this.editableGif, (Object)altTextActivityContentViewArgs.editableGif) && zzd.a((Object)this.altText, (Object)altTextActivityContentViewArgs.altText);
    }
    
    public final String getAltText() {
        return this.altText;
    }
    
    public final nw9 getEditableGif() {
        return this.editableGif;
    }
    
    public final rw9 getEditableImage() {
        return this.editableImage;
    }
    
    @Override
    public int hashCode() {
        final rw9 editableImage = this.editableImage;
        int hashCode = 0;
        int hashCode2;
        if (editableImage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = editableImage.hashCode();
        }
        final nw9 editableGif = this.editableGif;
        int hashCode3;
        if (editableGif == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = editableGif.hashCode();
        }
        final String altText = this.altText;
        if (altText != null) {
            hashCode = altText.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final rw9 editableImage = this.editableImage;
        final nw9 editableGif = this.editableGif;
        final String altText = this.altText;
        final StringBuilder sb = new StringBuilder();
        sb.append("AltTextActivityContentViewArgs(editableImage=");
        sb.append(editableImage);
        sb.append(", editableGif=");
        sb.append(editableGif);
        sb.append(", altText=");
        return hi.I(sb, altText, ")");
    }
}
