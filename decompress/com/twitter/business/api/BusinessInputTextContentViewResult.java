// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/twitter/business/api/BusinessInputTextContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "inputTextValue", "tag", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getInputTextValue", "()Ljava/lang/String;", "getTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessInputTextContentViewResult implements bn6
{
    public static final BusinessInputTextContentViewResult.BusinessInputTextContentViewResult$Companion Companion;
    private final String inputTextValue;
    private final String tag;
    
    static {
        Companion = new BusinessInputTextContentViewResult.BusinessInputTextContentViewResult$Companion();
    }
    
    public BusinessInputTextContentViewResult(final int n, final String inputTextValue, final String tag, final hlp hlp) {
        if (0x3 == (n & 0x3)) {
            this.inputTextValue = inputTextValue;
            this.tag = tag;
            return;
        }
        blz.a0(n, 3, BusinessInputTextContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInputTextContentViewResult(final String inputTextValue, final String tag) {
        czd.f((Object)inputTextValue, "inputTextValue");
        this.inputTextValue = inputTextValue;
        this.tag = tag;
    }
    
    public static BusinessInputTextContentViewResult copy$default(final BusinessInputTextContentViewResult businessInputTextContentViewResult, String inputTextValue, String tag, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            inputTextValue = businessInputTextContentViewResult.inputTextValue;
        }
        if ((n & 0x2) != 0x0) {
            tag = businessInputTextContentViewResult.tag;
        }
        return businessInputTextContentViewResult.copy(inputTextValue, tag);
    }
    
    public static final void write$Self(final BusinessInputTextContentViewResult businessInputTextContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessInputTextContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.S(serialDescriptor, 0, businessInputTextContentViewResult.inputTextValue);
        xc6.y(serialDescriptor, 1, (jlp)gkr.a, (Object)businessInputTextContentViewResult.tag);
    }
    
    public final String component1() {
        return this.inputTextValue;
    }
    
    public final String component2() {
        return this.tag;
    }
    
    public final BusinessInputTextContentViewResult copy(final String s, final String s2) {
        czd.f((Object)s, "inputTextValue");
        return new BusinessInputTextContentViewResult(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessInputTextContentViewResult)) {
            return false;
        }
        final BusinessInputTextContentViewResult businessInputTextContentViewResult = (BusinessInputTextContentViewResult)o;
        return czd.a((Object)this.inputTextValue, (Object)businessInputTextContentViewResult.inputTextValue) && czd.a((Object)this.tag, (Object)businessInputTextContentViewResult.tag);
    }
    
    public final String getInputTextValue() {
        return this.inputTextValue;
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.inputTextValue.hashCode();
        final String tag = this.tag;
        int hashCode2;
        if (tag == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tag.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        return zh8.o("BusinessInputTextContentViewResult(inputTextValue=", this.inputTextValue, ", tag=", this.tag, ")");
    }
}
