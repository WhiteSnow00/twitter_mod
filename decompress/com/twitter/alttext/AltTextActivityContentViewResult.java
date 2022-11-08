// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.alttext;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\"B3\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006)" }, d2 = { "Lcom/twitter/alttext/AltTextActivityContentViewResult;", "Lvn6;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lrw9;", "component1", "Lnw9;", "component2", "editableImage", "editableGif", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lrw9;", "getEditableImage", "()Lrw9;", "getEditableImage$annotations", "()V", "Lnw9;", "getEditableGif", "()Lnw9;", "getEditableGif$annotations", "<init>", "(Lrw9;Lnw9;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILrw9;Lnw9;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.alttext.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class AltTextActivityContentViewResult implements vn6
{
    public static final AltTextActivityContentViewResult.AltTextActivityContentViewResult$Companion Companion;
    private final nw9 editableGif;
    private final rw9 editableImage;
    
    static {
        Companion = new AltTextActivityContentViewResult.AltTextActivityContentViewResult$Companion();
    }
    
    public AltTextActivityContentViewResult() {
        this(null, null, 3, null);
    }
    
    public AltTextActivityContentViewResult(final rw9 editableImage, final nw9 editableGif) {
        this.editableImage = editableImage;
        this.editableGif = editableGif;
    }
    
    public static final void write$Self(final AltTextActivityContentViewResult altTextActivityContentViewResult, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)altTextActivityContentViewResult, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = sd6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (altTextActivityContentViewResult.editableImage == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            sd6.x(serialDescriptor, 0, (skp)uw9.b, (Object)altTextActivityContentViewResult.editableImage);
        }
        int n2 = 0;
        Label_0099: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (altTextActivityContentViewResult.editableGif == null) {
                    break Label_0099;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 1, (skp)ow9.b, (Object)altTextActivityContentViewResult.editableGif);
        }
    }
    
    public final rw9 component1() {
        return this.editableImage;
    }
    
    public final nw9 component2() {
        return this.editableGif;
    }
    
    public final AltTextActivityContentViewResult copy(final rw9 rw9, final nw9 nw9) {
        return new AltTextActivityContentViewResult(rw9, nw9);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AltTextActivityContentViewResult)) {
            return false;
        }
        final AltTextActivityContentViewResult altTextActivityContentViewResult = (AltTextActivityContentViewResult)o;
        return zzd.a((Object)this.editableImage, (Object)altTextActivityContentViewResult.editableImage) && zzd.a((Object)this.editableGif, (Object)altTextActivityContentViewResult.editableGif);
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
        if (editableGif != null) {
            hashCode = editableGif.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final rw9 editableImage = this.editableImage;
        final nw9 editableGif = this.editableGif;
        final StringBuilder sb = new StringBuilder();
        sb.append("AltTextActivityContentViewResult(editableImage=");
        sb.append(editableImage);
        sb.append(", editableGif=");
        sb.append(editableGif);
        sb.append(")");
        return sb.toString();
    }
}
