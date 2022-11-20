// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.alttext;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'B=\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006." }, d2 = { "Lcom/twitter/alttext/AltTextActivityContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lew9;", "component1", "Law9;", "component2", "", "component3", "editableImage", "editableGif", "altText", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAltText", "()Ljava/lang/String;", "Lew9;", "getEditableImage", "()Lew9;", "getEditableImage$annotations", "()V", "Law9;", "getEditableGif", "()Law9;", "getEditableGif$annotations", "<init>", "(Lew9;Law9;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILew9;Law9;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.alttext.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class AltTextActivityContentViewArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final String altText;
    private final aw9 editableGif;
    private final ew9 editableImage;
    
    static {
        Companion = new Companion();
    }
    
    public AltTextActivityContentViewArgs() {
        this(null, null, null, 7, null);
    }
    
    public AltTextActivityContentViewArgs(final int n, @flp(with = hw9.class) final ew9 editableImage, @flp(with = bw9.class) final aw9 editableGif, final String altText, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.editableImage = null;
            }
            else {
                this.editableImage = editableImage;
            }
            if ((n & 0x2) == 0x0) {
                this.editableGif = null;
            }
            else {
                this.editableGif = editableGif;
            }
            if ((n & 0x4) == 0x0) {
                this.altText = null;
            }
            else {
                this.altText = altText;
            }
            return;
        }
        blz.a0(n, 0, AltTextActivityContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public AltTextActivityContentViewArgs(final ew9 editableImage, final aw9 editableGif, final String altText) {
        this.editableImage = editableImage;
        this.editableGif = editableGif;
        this.altText = altText;
    }
    
    public AltTextActivityContentViewArgs(ew9 ew9, aw9 aw9, String s, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            ew9 = null;
        }
        if ((n & 0x2) != 0x0) {
            aw9 = null;
        }
        if ((n & 0x4) != 0x0) {
            s = null;
        }
        this(ew9, aw9, s);
    }
    
    public static AltTextActivityContentViewArgs copy$default(final AltTextActivityContentViewArgs altTextActivityContentViewArgs, ew9 editableImage, aw9 editableGif, String altText, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            editableImage = altTextActivityContentViewArgs.editableImage;
        }
        if ((n & 0x2) != 0x0) {
            editableGif = altTextActivityContentViewArgs.editableGif;
        }
        if ((n & 0x4) != 0x0) {
            altText = altTextActivityContentViewArgs.altText;
        }
        return altTextActivityContentViewArgs.copy(editableImage, editableGif, altText);
    }
    
    @flp(with = bw9.class)
    public static void getEditableGif$annotations() {
    }
    
    @flp(with = hw9.class)
    public static void getEditableImage$annotations() {
    }
    
    public static final void write$Self(final AltTextActivityContentViewArgs altTextActivityContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)altTextActivityContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
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
            xc6.y(serialDescriptor, 0, (jlp)hw9.b, (Object)altTextActivityContentViewArgs.editableImage);
        }
        boolean b2 = false;
        Label_0098: {
            if (!xc6.z(serialDescriptor)) {
                if (altTextActivityContentViewArgs.editableGif == null) {
                    b2 = false;
                    break Label_0098;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.y(serialDescriptor, 1, (jlp)bw9.b, (Object)altTextActivityContentViewArgs.editableGif);
        }
        int n2 = 0;
        Label_0142: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (altTextActivityContentViewArgs.altText == null) {
                    break Label_0142;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 2, (jlp)gkr.a, (Object)altTextActivityContentViewArgs.altText);
        }
    }
    
    public final ew9 component1() {
        return this.editableImage;
    }
    
    public final aw9 component2() {
        return this.editableGif;
    }
    
    public final String component3() {
        return this.altText;
    }
    
    public final AltTextActivityContentViewArgs copy(final ew9 ew9, final aw9 aw9, final String s) {
        return new AltTextActivityContentViewArgs(ew9, aw9, s);
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
        return czd.a((Object)this.editableImage, (Object)altTextActivityContentViewArgs.editableImage) && czd.a((Object)this.editableGif, (Object)altTextActivityContentViewArgs.editableGif) && czd.a((Object)this.altText, (Object)altTextActivityContentViewArgs.altText);
    }
    
    public final String getAltText() {
        return this.altText;
    }
    
    public final aw9 getEditableGif() {
        return this.editableGif;
    }
    
    public final ew9 getEditableImage() {
        return this.editableImage;
    }
    
    @Override
    public int hashCode() {
        final ew9 editableImage = this.editableImage;
        int hashCode = 0;
        int hashCode2;
        if (editableImage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = editableImage.hashCode();
        }
        final aw9 editableGif = this.editableGif;
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
        final ew9 editableImage = this.editableImage;
        final aw9 editableGif = this.editableGif;
        final String altText = this.altText;
        final StringBuilder sb = new StringBuilder();
        sb.append("AltTextActivityContentViewArgs(editableImage=");
        sb.append(editableImage);
        sb.append(", editableGif=");
        sb.append(editableGif);
        sb.append(", altText=");
        return ed.B(sb, altText, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/alttext/AltTextActivityContentViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/alttext/AltTextActivityContentViewArgs;", "serializer", "subsystem.tfa.alttext.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<AltTextActivityContentViewArgs> serializer() {
            return (KSerializer<AltTextActivityContentViewArgs>)AltTextActivityContentViewArgs$$serializer.INSTANCE;
        }
    }
}
