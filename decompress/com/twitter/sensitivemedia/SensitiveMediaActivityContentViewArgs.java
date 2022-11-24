// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sensitivemedia;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u0010.B\u0015\b\u0016\u0012\n\u0010/\u001a\u0006\u0012\u0002\b\u00030!¢\u0006\u0004\b-\u00100B3\b\u0017\u0012\u0006\u00101\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b-\u00104J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R!\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010+¨\u00067" }, d2 = { "Lcom/twitter/sensitivemedia/SensitiveMediaActivityContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lex9;", "component1", "Lqx9;", "component2", "editableImage", "editableVideo", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lex9;", "getEditableImage", "()Lex9;", "getEditableImage$annotations", "()V", "Lqx9;", "getEditableVideo", "()Lqx9;", "getEditableVideo$annotations", "Ljx9;", "editableMedia$delegate", "Lnxe;", "getEditableMedia", "()Ljx9;", "editableMedia", "", "Lxip;", "sensitiveMediaCategories$delegate", "getSensitiveMediaCategories", "()Ljava/util/Set;", "sensitiveMediaCategories", "<init>", "(Lex9;Lqx9;)V", "media", "(Ljx9;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILex9;Lqx9;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.sensitivemedia.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaActivityContentViewArgs implements ContentViewArgs
{
    public static final SensitiveMediaActivityContentViewArgs.SensitiveMediaActivityContentViewArgs$Companion Companion;
    private final ex9 editableImage;
    private final nxe editableMedia$delegate;
    private final qx9 editableVideo;
    private final nxe sensitiveMediaCategories$delegate;
    
    static {
        Companion = new SensitiveMediaActivityContentViewArgs.SensitiveMediaActivityContentViewArgs$Companion();
    }
    
    public SensitiveMediaActivityContentViewArgs(final int n, @bmp(with = hx9.class) final ex9 editableImage, @bmp(with = tx9.class) final qx9 editableVideo, final dmp dmp) {
        if (0x3 == (n & 0x3)) {
            this.editableImage = editableImage;
            this.editableVideo = editableVideo;
            this.editableMedia$delegate = jty.N((ptb)new SensitiveMediaActivityContentViewArgs$a(this));
            this.sensitiveMediaCategories$delegate = jty.N((ptb)new SensitiveMediaActivityContentViewArgs$b(this));
            return;
        }
        shw.V0(n, 3, SensitiveMediaActivityContentView.SensitiveMediaActivityContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public SensitiveMediaActivityContentViewArgs(final ex9 editableImage, final qx9 editableVideo) {
        this.editableImage = editableImage;
        this.editableVideo = editableVideo;
        this.editableMedia$delegate = jty.N((ptb)new SensitiveMediaActivityContentViewArgs$c(this));
        this.sensitiveMediaCategories$delegate = jty.N((ptb)new SensitiveMediaActivityContentViewArgs$d(this));
    }
    
    public SensitiveMediaActivityContentViewArgs(final jx9<?> jx9) {
        e0e.f((Object)jx9, "media");
        final boolean b = jx9 instanceof ex9;
        qx9 qx9 = null;
        ex9 ex9;
        if (b) {
            ex9 = (ex9)jx9;
        }
        else {
            ex9 = null;
        }
        if (jx9 instanceof qx9) {
            qx9 = (qx9)jx9;
        }
        this(ex9, qx9);
    }
    
    public static SensitiveMediaActivityContentViewArgs copy$default(final SensitiveMediaActivityContentViewArgs sensitiveMediaActivityContentViewArgs, ex9 editableImage, qx9 editableVideo, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            editableImage = sensitiveMediaActivityContentViewArgs.editableImage;
        }
        if ((n & 0x2) != 0x0) {
            editableVideo = sensitiveMediaActivityContentViewArgs.editableVideo;
        }
        return sensitiveMediaActivityContentViewArgs.copy(editableImage, editableVideo);
    }
    
    @bmp(with = hx9.class)
    public static void getEditableImage$annotations() {
    }
    
    @bmp(with = tx9.class)
    public static void getEditableVideo$annotations() {
    }
    
    public static final void write$Self(final SensitiveMediaActivityContentViewArgs sensitiveMediaActivityContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)sensitiveMediaActivityContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.y(serialDescriptor, 0, (fmp)hx9.b, (Object)sensitiveMediaActivityContentViewArgs.editableImage);
        ee6.y(serialDescriptor, 1, (fmp)tx9.b, (Object)sensitiveMediaActivityContentViewArgs.editableVideo);
    }
    
    public final ex9 component1() {
        return this.editableImage;
    }
    
    public final qx9 component2() {
        return this.editableVideo;
    }
    
    public final SensitiveMediaActivityContentViewArgs copy(final ex9 ex9, final qx9 qx9) {
        return new SensitiveMediaActivityContentViewArgs(ex9, qx9);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveMediaActivityContentViewArgs)) {
            return false;
        }
        final SensitiveMediaActivityContentViewArgs sensitiveMediaActivityContentViewArgs = (SensitiveMediaActivityContentViewArgs)o;
        return e0e.a((Object)this.editableImage, (Object)sensitiveMediaActivityContentViewArgs.editableImage) && e0e.a((Object)this.editableVideo, (Object)sensitiveMediaActivityContentViewArgs.editableVideo);
    }
    
    public final ex9 getEditableImage() {
        return this.editableImage;
    }
    
    public final jx9<?> getEditableMedia() {
        return (jx9<?>)this.editableMedia$delegate.getValue();
    }
    
    public final qx9 getEditableVideo() {
        return this.editableVideo;
    }
    
    public final Set<xip> getSensitiveMediaCategories() {
        return (Set)this.sensitiveMediaCategories$delegate.getValue();
    }
    
    @Override
    public int hashCode() {
        final ex9 editableImage = this.editableImage;
        int hashCode = 0;
        int hashCode2;
        if (editableImage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = editableImage.hashCode();
        }
        final qx9 editableVideo = this.editableVideo;
        if (editableVideo != null) {
            hashCode = editableVideo.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final ex9 editableImage = this.editableImage;
        final qx9 editableVideo = this.editableVideo;
        final StringBuilder sb = new StringBuilder();
        sb.append("SensitiveMediaActivityContentViewArgs(editableImage=");
        sb.append(editableImage);
        sb.append(", editableVideo=");
        sb.append(editableVideo);
        sb.append(")");
        return sb.toString();
    }
}
