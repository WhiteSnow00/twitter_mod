// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBy\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\"\u001a\u00020\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010@B\u0091\u0001\b\u0017\u0012\u0006\u0010A\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b?\u0010DJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0089\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u00d6\u0003R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b0\u0010-R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u001e\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b7\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b9\u0010-R\"\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<¨\u0006G" }, d2 = { "Lcom/twitter/business/api/BusinessInputTextContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "Lcom/twitter/business/api/ValidationType;", "component12", "tag", "inputText", "screenTitle", "textInputHint", "textInputError", "inputCharacterMaxCount", "textInputType", "textInputLabel", "warningMessage", "warningUrl", "scribePageName", "validationType", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getInputText", "getScreenTitle", "getTextInputHint", "getTextInputError", "I", "getInputCharacterMaxCount", "()I", "getTextInputType", "getTextInputLabel", "getWarningMessage", "getWarningUrl", "getScribePageName", "Lcom/twitter/business/api/ValidationType;", "getValidationType", "()Lcom/twitter/business/api/ValidationType;", "getValidationType$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/api/ValidationType;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/api/ValidationType;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessInputTextContentViewArgs implements ContentViewArgs
{
    public static final BusinessInputTextContentViewArgs.BusinessInputTextContentViewArgs$Companion Companion;
    private final int inputCharacterMaxCount;
    private final String inputText;
    private final String screenTitle;
    private final String scribePageName;
    private final String tag;
    private final String textInputError;
    private final String textInputHint;
    private final String textInputLabel;
    private final int textInputType;
    private final ValidationType validationType;
    private final String warningMessage;
    private final String warningUrl;
    
    static {
        Companion = new BusinessInputTextContentViewArgs.BusinessInputTextContentViewArgs$Companion();
    }
    
    public BusinessInputTextContentViewArgs(final int n, final String tag, String inputText, final String screenTitle, final String textInputHint, final String textInputError, final int inputCharacterMaxCount, final int textInputType, final String textInputLabel, final String warningMessage, final String warningUrl, final String scribePageName, @bmp final ValidationType validationType, final dmp dmp) {
        if (0x5FC == (n & 0x5FC)) {
            if ((n & 0x1) == 0x0) {
                this.tag = null;
            }
            else {
                this.tag = tag;
            }
            if ((n & 0x2) == 0x0) {
                inputText = "";
            }
            this.inputText = inputText;
            this.screenTitle = screenTitle;
            this.textInputHint = textInputHint;
            this.textInputError = textInputError;
            this.inputCharacterMaxCount = inputCharacterMaxCount;
            this.textInputType = textInputType;
            this.textInputLabel = textInputLabel;
            this.warningMessage = warningMessage;
            if ((n & 0x200) == 0x0) {
                this.warningUrl = null;
            }
            else {
                this.warningUrl = warningUrl;
            }
            this.scribePageName = scribePageName;
            if ((n & 0x800) == 0x0) {
                this.validationType = null;
            }
            else {
                this.validationType = validationType;
            }
            return;
        }
        shw.V0(n, 1532, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInputTextContentViewArgs(final String tag, final String inputText, final String screenTitle, final String textInputHint, final String textInputError, final int inputCharacterMaxCount, final int textInputType, final String textInputLabel, final String warningMessage, final String warningUrl, final String scribePageName, final ValidationType validationType) {
        e0e.f((Object)inputText, "inputText");
        e0e.f((Object)screenTitle, "screenTitle");
        e0e.f((Object)textInputHint, "textInputHint");
        e0e.f((Object)textInputError, "textInputError");
        e0e.f((Object)textInputLabel, "textInputLabel");
        e0e.f((Object)scribePageName, "scribePageName");
        this.tag = tag;
        this.inputText = inputText;
        this.screenTitle = screenTitle;
        this.textInputHint = textInputHint;
        this.textInputError = textInputError;
        this.inputCharacterMaxCount = inputCharacterMaxCount;
        this.textInputType = textInputType;
        this.textInputLabel = textInputLabel;
        this.warningMessage = warningMessage;
        this.warningUrl = warningUrl;
        this.scribePageName = scribePageName;
        this.validationType = validationType;
    }
    
    public BusinessInputTextContentViewArgs(String s, String s2, final String s3, final String s4, final String s5, final int n, final int n2, final String s6, final String s7, String s8, final String s9, ValidationType validationType, final int n3, final wg8 wg8) {
        if ((n3 & 0x1) != 0x0) {
            s = null;
        }
        if ((n3 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n3 & 0x200) != 0x0) {
            s8 = null;
        }
        if ((n3 & 0x800) != 0x0) {
            validationType = null;
        }
        this(s, s2, s3, s4, s5, n, n2, s6, s7, s8, s9, validationType);
    }
    
    public static BusinessInputTextContentViewArgs copy$default(final BusinessInputTextContentViewArgs businessInputTextContentViewArgs, String tag, String inputText, String screenTitle, String textInputHint, String textInputError, int inputCharacterMaxCount, int textInputType, String textInputLabel, String warningMessage, String warningUrl, String scribePageName, ValidationType validationType, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            tag = businessInputTextContentViewArgs.tag;
        }
        if ((n & 0x2) != 0x0) {
            inputText = businessInputTextContentViewArgs.inputText;
        }
        if ((n & 0x4) != 0x0) {
            screenTitle = businessInputTextContentViewArgs.screenTitle;
        }
        if ((n & 0x8) != 0x0) {
            textInputHint = businessInputTextContentViewArgs.textInputHint;
        }
        if ((n & 0x10) != 0x0) {
            textInputError = businessInputTextContentViewArgs.textInputError;
        }
        if ((n & 0x20) != 0x0) {
            inputCharacterMaxCount = businessInputTextContentViewArgs.inputCharacterMaxCount;
        }
        if ((n & 0x40) != 0x0) {
            textInputType = businessInputTextContentViewArgs.textInputType;
        }
        if ((n & 0x80) != 0x0) {
            textInputLabel = businessInputTextContentViewArgs.textInputLabel;
        }
        if ((n & 0x100) != 0x0) {
            warningMessage = businessInputTextContentViewArgs.warningMessage;
        }
        if ((n & 0x200) != 0x0) {
            warningUrl = businessInputTextContentViewArgs.warningUrl;
        }
        if ((n & 0x400) != 0x0) {
            scribePageName = businessInputTextContentViewArgs.scribePageName;
        }
        if ((n & 0x800) != 0x0) {
            validationType = businessInputTextContentViewArgs.validationType;
        }
        return businessInputTextContentViewArgs.copy(tag, inputText, screenTitle, textInputHint, textInputError, inputCharacterMaxCount, textInputType, textInputLabel, warningMessage, warningUrl, scribePageName, validationType);
    }
    
    @bmp
    public static void getValidationType$annotations() {
    }
    
    public static final void write$Self(final BusinessInputTextContentViewArgs businessInputTextContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessInputTextContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (businessInputTextContentViewArgs.tag == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            ee6.y(serialDescriptor, 0, (fmp)dlr.a, (Object)businessInputTextContentViewArgs.tag);
        }
        boolean b2 = false;
        Label_0103: {
            if (!ee6.z(serialDescriptor)) {
                if (e0e.a((Object)businessInputTextContentViewArgs.inputText, (Object)"")) {
                    b2 = false;
                    break Label_0103;
                }
            }
            b2 = true;
        }
        if (b2) {
            ee6.S(serialDescriptor, 1, businessInputTextContentViewArgs.inputText);
        }
        ee6.S(serialDescriptor, 2, businessInputTextContentViewArgs.screenTitle);
        ee6.S(serialDescriptor, 3, businessInputTextContentViewArgs.textInputHint);
        ee6.S(serialDescriptor, 4, businessInputTextContentViewArgs.textInputError);
        ee6.Q(serialDescriptor, 5, businessInputTextContentViewArgs.inputCharacterMaxCount);
        ee6.Q(serialDescriptor, 6, businessInputTextContentViewArgs.textInputType);
        ee6.S(serialDescriptor, 7, businessInputTextContentViewArgs.textInputLabel);
        final dlr a = dlr.a;
        ee6.y(serialDescriptor, 8, (fmp)a, (Object)businessInputTextContentViewArgs.warningMessage);
        boolean b3 = false;
        Label_0240: {
            if (!ee6.z(serialDescriptor)) {
                if (businessInputTextContentViewArgs.warningUrl == null) {
                    b3 = false;
                    break Label_0240;
                }
            }
            b3 = true;
        }
        if (b3) {
            ee6.y(serialDescriptor, 9, (fmp)a, (Object)businessInputTextContentViewArgs.warningUrl);
        }
        ee6.S(serialDescriptor, 10, businessInputTextContentViewArgs.scribePageName);
        int n2 = 0;
        Label_0297: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (businessInputTextContentViewArgs.validationType == null) {
                    break Label_0297;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.y(serialDescriptor, 11, (fmp)ValidationType.Companion.serializer(), (Object)businessInputTextContentViewArgs.validationType);
        }
    }
    
    public final String component1() {
        return this.tag;
    }
    
    public final String component10() {
        return this.warningUrl;
    }
    
    public final String component11() {
        return this.scribePageName;
    }
    
    public final ValidationType component12() {
        return this.validationType;
    }
    
    public final String component2() {
        return this.inputText;
    }
    
    public final String component3() {
        return this.screenTitle;
    }
    
    public final String component4() {
        return this.textInputHint;
    }
    
    public final String component5() {
        return this.textInputError;
    }
    
    public final int component6() {
        return this.inputCharacterMaxCount;
    }
    
    public final int component7() {
        return this.textInputType;
    }
    
    public final String component8() {
        return this.textInputLabel;
    }
    
    public final String component9() {
        return this.warningMessage;
    }
    
    public final BusinessInputTextContentViewArgs copy(final String s, final String s2, final String s3, final String s4, final String s5, final int n, final int n2, final String s6, final String s7, final String s8, final String s9, final ValidationType validationType) {
        e0e.f((Object)s2, "inputText");
        e0e.f((Object)s3, "screenTitle");
        e0e.f((Object)s4, "textInputHint");
        e0e.f((Object)s5, "textInputError");
        e0e.f((Object)s6, "textInputLabel");
        e0e.f((Object)s9, "scribePageName");
        return new BusinessInputTextContentViewArgs(s, s2, s3, s4, s5, n, n2, s6, s7, s8, s9, validationType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessInputTextContentViewArgs)) {
            return false;
        }
        final BusinessInputTextContentViewArgs businessInputTextContentViewArgs = (BusinessInputTextContentViewArgs)o;
        return e0e.a((Object)this.tag, (Object)businessInputTextContentViewArgs.tag) && e0e.a((Object)this.inputText, (Object)businessInputTextContentViewArgs.inputText) && e0e.a((Object)this.screenTitle, (Object)businessInputTextContentViewArgs.screenTitle) && e0e.a((Object)this.textInputHint, (Object)businessInputTextContentViewArgs.textInputHint) && e0e.a((Object)this.textInputError, (Object)businessInputTextContentViewArgs.textInputError) && this.inputCharacterMaxCount == businessInputTextContentViewArgs.inputCharacterMaxCount && this.textInputType == businessInputTextContentViewArgs.textInputType && e0e.a((Object)this.textInputLabel, (Object)businessInputTextContentViewArgs.textInputLabel) && e0e.a((Object)this.warningMessage, (Object)businessInputTextContentViewArgs.warningMessage) && e0e.a((Object)this.warningUrl, (Object)businessInputTextContentViewArgs.warningUrl) && e0e.a((Object)this.scribePageName, (Object)businessInputTextContentViewArgs.scribePageName) && e0e.a((Object)this.validationType, (Object)businessInputTextContentViewArgs.validationType);
    }
    
    public final int getInputCharacterMaxCount() {
        return this.inputCharacterMaxCount;
    }
    
    public final String getInputText() {
        return this.inputText;
    }
    
    public final String getScreenTitle() {
        return this.screenTitle;
    }
    
    public final String getScribePageName() {
        return this.scribePageName;
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    public final String getTextInputError() {
        return this.textInputError;
    }
    
    public final String getTextInputHint() {
        return this.textInputHint;
    }
    
    public final String getTextInputLabel() {
        return this.textInputLabel;
    }
    
    public final int getTextInputType() {
        return this.textInputType;
    }
    
    public final ValidationType getValidationType() {
        return this.validationType;
    }
    
    public final String getWarningMessage() {
        return this.warningMessage;
    }
    
    public final String getWarningUrl() {
        return this.warningUrl;
    }
    
    @Override
    public int hashCode() {
        final String tag = this.tag;
        final int n = 0;
        int hashCode;
        if (tag == null) {
            hashCode = 0;
        }
        else {
            hashCode = tag.hashCode();
        }
        final int d = brg.d(this.textInputLabel, ((brg.d(this.textInputError, brg.d(this.textInputHint, brg.d(this.screenTitle, brg.d(this.inputText, hashCode * 31, 31), 31), 31), 31) + this.inputCharacterMaxCount) * 31 + this.textInputType) * 31, 31);
        final String warningMessage = this.warningMessage;
        int hashCode2;
        if (warningMessage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = warningMessage.hashCode();
        }
        final String warningUrl = this.warningUrl;
        int hashCode3;
        if (warningUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = warningUrl.hashCode();
        }
        final int d2 = brg.d(this.scribePageName, ((d + hashCode2) * 31 + hashCode3) * 31, 31);
        final ValidationType validationType = this.validationType;
        int hashCode4;
        if (validationType == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = validationType.hashCode();
        }
        return d2 + hashCode4;
    }
    
    @Override
    public String toString() {
        final String tag = this.tag;
        final String inputText = this.inputText;
        final String screenTitle = this.screenTitle;
        final String textInputHint = this.textInputHint;
        final String textInputError = this.textInputError;
        final int inputCharacterMaxCount = this.inputCharacterMaxCount;
        final int textInputType = this.textInputType;
        final String textInputLabel = this.textInputLabel;
        final String warningMessage = this.warningMessage;
        final String warningUrl = this.warningUrl;
        final String scribePageName = this.scribePageName;
        final ValidationType validationType = this.validationType;
        final StringBuilder k = l58.k("BusinessInputTextContentViewArgs(tag=", tag, ", inputText=", inputText, ", screenTitle=");
        jba.s(k, screenTitle, ", textInputHint=", textInputHint, ", textInputError=");
        m51.z(k, textInputError, ", inputCharacterMaxCount=", inputCharacterMaxCount, ", textInputType=");
        bj.A(k, textInputType, ", textInputLabel=", textInputLabel, ", warningMessage=");
        jba.s(k, warningMessage, ", warningUrl=", warningUrl, ", scribePageName=");
        k.append(scribePageName);
        k.append(", validationType=");
        k.append(validationType);
        k.append(")");
        return k.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessInputTextContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessInputTextContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessInputTextContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessInputTextContentViewArgs", (ezb)(INSTANCE = new $serializer()), 12);
            descriptor2.k("tag", true);
            descriptor2.k("inputText", true);
            descriptor2.k("screenTitle", false);
            descriptor2.k("textInputHint", false);
            descriptor2.k("textInputError", false);
            descriptor2.k("inputCharacterMaxCount", false);
            descriptor2.k("textInputType", false);
            descriptor2.k("textInputLabel", false);
            descriptor2.k("warningMessage", false);
            descriptor2.k("warningUrl", true);
            descriptor2.k("scribePageName", false);
            descriptor2.k("validationType", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final dlr a = dlr.a;
            final KSerializer e = BuiltinSerializersKt.e((KSerializer)a);
            final mud a2 = mud.a;
            return (KSerializer<?>[])new KSerializer[] { e, (KSerializer)a, (KSerializer)a, (KSerializer)a, (KSerializer)a, (KSerializer)a2, (KSerializer)a2, (KSerializer)a, BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), (KSerializer)a, BuiltinSerializersKt.e(ValidationType.Companion.serializer()) };
        }
        
        public BusinessInputTextContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            Object n4;
            Object n3 = n4 = null;
            Object i;
            String m = (String)(i = n4);
            Object k;
            String j = (String)(k = i);
            Object m2;
            String l = (String)(m2 = k);
            int n5 = 0;
            int n6 = 1;
            int j2 = 0;
            int j3 = 0;
            while (n6 != 0) {
                final int o = c.o(descriptor);
                switch (o) {
                    default: {
                        throw new UnknownFieldException(o);
                    }
                    case 11: {
                        n2 = c.n(descriptor, 11, (DeserializationStrategy)ValidationType.Companion.serializer(), n2);
                        n5 |= 0x800;
                        continue;
                    }
                    case 10: {
                        m2 = c.m(descriptor, 10);
                        n5 |= 0x400;
                        continue;
                    }
                    case 9: {
                        n3 = c.n(descriptor, 9, (DeserializationStrategy)dlr.a, n3);
                        n5 |= 0x200;
                        continue;
                    }
                    case 8: {
                        n4 = c.n(descriptor, 8, (DeserializationStrategy)dlr.a, n4);
                        n5 |= 0x100;
                        continue;
                    }
                    case 7: {
                        l = c.m(descriptor, 7);
                        n5 |= 0x80;
                        continue;
                    }
                    case 6: {
                        j3 = c.j(descriptor, 6);
                        n5 |= 0x40;
                        continue;
                    }
                    case 5: {
                        j2 = c.j(descriptor, 5);
                        n5 |= 0x20;
                        continue;
                    }
                    case 4: {
                        k = c.m(descriptor, 4);
                        n5 |= 0x10;
                        continue;
                    }
                    case 3: {
                        j = c.m(descriptor, 3);
                        n5 |= 0x8;
                        continue;
                    }
                    case 2: {
                        i = c.m(descriptor, 2);
                        n5 |= 0x4;
                        continue;
                    }
                    case 1: {
                        m = c.m(descriptor, 1);
                        n5 |= 0x2;
                        continue;
                    }
                    case 0: {
                        n = c.n(descriptor, 0, (DeserializationStrategy)dlr.a, n);
                        n5 |= 0x1;
                        continue;
                    }
                    case -1: {
                        n6 = 0;
                        continue;
                    }
                }
            }
            c.d(descriptor);
            return new BusinessInputTextContentViewArgs(n5, (String)n, m, (String)i, j, (String)k, j2, j3, l, (String)n4, (String)n3, (String)m2, (ValidationType)n2, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessInputTextContentViewArgs businessInputTextContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessInputTextContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessInputTextContentViewArgs.write$Self(businessInputTextContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessInputTextContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
