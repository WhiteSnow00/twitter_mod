// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sensitivemedia;

import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Set;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b�\u0006\u0004\b-\u0010.B%\b\u0016\u0012\f\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010!\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020(0'�\u0006\u0004\b-\u00101B3\b\u0017\u0012\u0006\u00102\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u000103�\u0006\u0004\b-\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004�\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004�\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010!8FX\u0086\u0084\u0002�\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R!\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8FX\u0086\u0084\u0002�\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010+�\u00068" }, d2 = { "Lcom/twitter/sensitivemedia/SensitiveMediaActivityContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lew9;", "component1", "Lpw9;", "component2", "editableImage", "editableVideo", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lew9;", "getEditableImage", "()Lew9;", "getEditableImage$annotations", "()V", "Lpw9;", "getEditableVideo", "()Lpw9;", "getEditableVideo$annotations", "Ljw9;", "editableMedia$delegate", "Lqwe;", "getEditableMedia", "()Ljw9;", "editableMedia", "", "Laip;", "sensitiveMediaCategories$delegate", "getSensitiveMediaCategories", "()Ljava/util/Set;", "sensitiveMediaCategories", "<init>", "(Lew9;Lpw9;)V", "media", "categories", "(Ljw9;Ljava/util/Set;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILew9;Lpw9;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.sensitivemedia.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaActivityContentViewResult implements bn6
{
    public static final SensitiveMediaActivityContentViewResult.SensitiveMediaActivityContentViewResult$Companion Companion;
    private final ew9 editableImage;
    private final qwe editableMedia$delegate;
    private final pw9 editableVideo;
    private final qwe sensitiveMediaCategories$delegate;
    
    static {
        Companion = new SensitiveMediaActivityContentViewResult.SensitiveMediaActivityContentViewResult$Companion();
    }
    
    public SensitiveMediaActivityContentViewResult() {
        this(null, null, 3, null);
    }
    
    public SensitiveMediaActivityContentViewResult(final int n, @flp(with = hw9.class) final ew9 editableImage, @flp(with = sw9.class) final pw9 editableVideo, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.editableImage = null;
            }
            else {
                this.editableImage = editableImage;
            }
            if ((n & 0x2) == 0x0) {
                this.editableVideo = null;
            }
            else {
                this.editableVideo = editableVideo;
            }
            this.editableMedia$delegate = pps.n((nsb)new SensitiveMediaActivityContentViewResult$a(this));
            this.sensitiveMediaCategories$delegate = pps.n((nsb)new SensitiveMediaActivityContentViewResult$b(this));
            return;
        }
        blz.a0(n, 0, SensitiveMediaActivity.SensitiveMediaActivityContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public SensitiveMediaActivityContentViewResult(final ew9 editableImage, final pw9 editableVideo) {
        this.editableImage = editableImage;
        this.editableVideo = editableVideo;
        this.editableMedia$delegate = pps.n((nsb)new SensitiveMediaActivityContentViewResult$c(this));
        this.sensitiveMediaCategories$delegate = pps.n((nsb)new SensitiveMediaActivityContentViewResult$d(this));
    }
    
    public SensitiveMediaActivityContentViewResult(ew9 ew9, pw9 pw9, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            ew9 = null;
        }
        if ((n & 0x2) != 0x0) {
            pw9 = null;
        }
        this(ew9, pw9);
    }
    
    public SensitiveMediaActivityContentViewResult(final jw9<?> jw9, final Set<? extends aip> set) {
        czd.f((Object)set, "categories");
        final boolean b = jw9 instanceof ew9;
        pw9 pw9 = null;
        ew9 ew9;
        if (b) {
            ew9 = (ew9)jw9;
        }
        else {
            ew9 = null;
        }
        ew9 ew10;
        if (ew9 != null) {
            final ew9$b ew9$b = new ew9$b(ew9);
            ew9$b.i = set;
            ew10 = new ew9(ew9$b);
        }
        else {
            ew10 = null;
        }
        pw9 pw10;
        if (jw9 instanceof pw9) {
            pw10 = (pw9)jw9;
        }
        else {
            pw10 = null;
        }
        if (pw10 != null) {
            pw9 = (pw9)pw10.f();
            pw9.R0 = (Set<aip>)set;
        }
        this(ew10, pw9);
    }
    
    public static SensitiveMediaActivityContentViewResult copy$default(final SensitiveMediaActivityContentViewResult sensitiveMediaActivityContentViewResult, ew9 editableImage, pw9 editableVideo, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            editableImage = sensitiveMediaActivityContentViewResult.editableImage;
        }
        if ((n & 0x2) != 0x0) {
            editableVideo = sensitiveMediaActivityContentViewResult.editableVideo;
        }
        return sensitiveMediaActivityContentViewResult.copy(editableImage, editableVideo);
    }
    
    @flp(with = hw9.class)
    public static void getEditableImage$annotations() {
    }
    
    @flp(with = sw9.class)
    public static void getEditableVideo$annotations() {
    }
    
    public static final void write$Self(final SensitiveMediaActivityContentViewResult sensitiveMediaActivityContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)sensitiveMediaActivityContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (sensitiveMediaActivityContentViewResult.editableImage == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)hw9.b, (Object)sensitiveMediaActivityContentViewResult.editableImage);
        }
        int n2 = 0;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (sensitiveMediaActivityContentViewResult.editableVideo == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 1, (jlp)sw9.b, (Object)sensitiveMediaActivityContentViewResult.editableVideo);
        }
    }
    
    public final ew9 component1() {
        return this.editableImage;
    }
    
    public final pw9 component2() {
        return this.editableVideo;
    }
    
    public final SensitiveMediaActivityContentViewResult copy(final ew9 ew9, final pw9 pw9) {
        return new SensitiveMediaActivityContentViewResult(ew9, pw9);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveMediaActivityContentViewResult)) {
            return false;
        }
        final SensitiveMediaActivityContentViewResult sensitiveMediaActivityContentViewResult = (SensitiveMediaActivityContentViewResult)o;
        return czd.a((Object)this.editableImage, (Object)sensitiveMediaActivityContentViewResult.editableImage) && czd.a((Object)this.editableVideo, (Object)sensitiveMediaActivityContentViewResult.editableVideo);
    }
    
    public final ew9 getEditableImage() {
        return this.editableImage;
    }
    
    public final jw9<?> getEditableMedia() {
        return (jw9<?>)this.editableMedia$delegate.getValue();
    }
    
    public final pw9 getEditableVideo() {
        return this.editableVideo;
    }
    
    public final Set<aip> getSensitiveMediaCategories() {
        return (Set)this.sensitiveMediaCategories$delegate.getValue();
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
        final pw9 editableVideo = this.editableVideo;
        if (editableVideo != null) {
            hashCode = editableVideo.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final ew9 editableImage = this.editableImage;
        final pw9 editableVideo = this.editableVideo;
        final StringBuilder sb = new StringBuilder();
        sb.append("SensitiveMediaActivityContentViewResult(editableImage=");
        sb.append(editableImage);
        sb.append(", editableVideo=");
        sb.append(editableVideo);
        sb.append(")");
        return sb.toString();
    }
}
