// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBy\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\"\u001a\u00020\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010@B\u0091\u0001\b\u0017\u0012\u0006\u0010A\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b?\u0010DJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0089\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u00d6\u0003R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b0\u0010-R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u001e\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b7\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b9\u0010-R\"\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<¨\u0006G" }, d2 = { "Lcom/twitter/business/api/BusinessInputTextContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "Lcom/twitter/business/api/ValidationType;", "component12", "tag", "inputText", "screenTitle", "textInputHint", "textInputError", "inputCharacterMaxCount", "textInputType", "textInputLabel", "warningMessage", "warningUrl", "scribePageName", "validationType", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getInputText", "getScreenTitle", "getTextInputHint", "getTextInputError", "I", "getInputCharacterMaxCount", "()I", "getTextInputType", "getTextInputLabel", "getWarningMessage", "getWarningUrl", "getScribePageName", "Lcom/twitter/business/api/ValidationType;", "getValidationType", "()Lcom/twitter/business/api/ValidationType;", "getValidationType$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/api/ValidationType;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/api/ValidationType;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
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
    
    public BusinessInputTextContentViewArgs(final int n, final String tag, String inputText, final String screenTitle, final String textInputHint, final String textInputError, final int inputCharacterMaxCount, final int textInputType, final String textInputLabel, final String warningMessage, final String warningUrl, final String scribePageName, @flp final ValidationType validationType, final hlp hlp) {
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
        blz.a0(n, 1532, BusinessInputTextContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInputTextContentViewArgs(final String tag, final String inputText, final String screenTitle, final String textInputHint, final String textInputError, final int inputCharacterMaxCount, final int textInputType, final String textInputLabel, final String warningMessage, final String warningUrl, final String scribePageName, final ValidationType validationType) {
        czd.f((Object)inputText, "inputText");
        czd.f((Object)screenTitle, "screenTitle");
        czd.f((Object)textInputHint, "textInputHint");
        czd.f((Object)textInputError, "textInputError");
        czd.f((Object)textInputLabel, "textInputLabel");
        czd.f((Object)scribePageName, "scribePageName");
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
    
    public BusinessInputTextContentViewArgs(String s, String s2, final String s3, final String s4, final String s5, final int n, final int n2, final String s6, final String s7, String s8, final String s9, ValidationType validationType, final int n3, final rf8 rf8) {
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
    
    @flp
    public static void getValidationType$annotations() {
    }
    
    public static final void write$Self(final BusinessInputTextContentViewArgs businessInputTextContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessInputTextContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
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
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)businessInputTextContentViewArgs.tag);
        }
        boolean b2 = false;
        Label_0103: {
            if (!xc6.z(serialDescriptor)) {
                if (czd.a((Object)businessInputTextContentViewArgs.inputText, (Object)"")) {
                    b2 = false;
                    break Label_0103;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.S(serialDescriptor, 1, businessInputTextContentViewArgs.inputText);
        }
        xc6.S(serialDescriptor, 2, businessInputTextContentViewArgs.screenTitle);
        xc6.S(serialDescriptor, 3, businessInputTextContentViewArgs.textInputHint);
        xc6.S(serialDescriptor, 4, businessInputTextContentViewArgs.textInputError);
        xc6.Q(serialDescriptor, 5, businessInputTextContentViewArgs.inputCharacterMaxCount);
        xc6.Q(serialDescriptor, 6, businessInputTextContentViewArgs.textInputType);
        xc6.S(serialDescriptor, 7, businessInputTextContentViewArgs.textInputLabel);
        final gkr a = gkr.a;
        xc6.y(serialDescriptor, 8, (jlp)a, (Object)businessInputTextContentViewArgs.warningMessage);
        boolean b3 = false;
        Label_0240: {
            if (!xc6.z(serialDescriptor)) {
                if (businessInputTextContentViewArgs.warningUrl == null) {
                    b3 = false;
                    break Label_0240;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.y(serialDescriptor, 9, (jlp)a, (Object)businessInputTextContentViewArgs.warningUrl);
        }
        xc6.S(serialDescriptor, 10, businessInputTextContentViewArgs.scribePageName);
        int n2 = 0;
        Label_0297: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (businessInputTextContentViewArgs.validationType == null) {
                    break Label_0297;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 11, (jlp)ValidationType.Companion.serializer(), (Object)businessInputTextContentViewArgs.validationType);
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
        czd.f((Object)s2, "inputText");
        czd.f((Object)s3, "screenTitle");
        czd.f((Object)s4, "textInputHint");
        czd.f((Object)s5, "textInputError");
        czd.f((Object)s6, "textInputLabel");
        czd.f((Object)s9, "scribePageName");
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
        return czd.a((Object)this.tag, (Object)businessInputTextContentViewArgs.tag) && czd.a((Object)this.inputText, (Object)businessInputTextContentViewArgs.inputText) && czd.a((Object)this.screenTitle, (Object)businessInputTextContentViewArgs.screenTitle) && czd.a((Object)this.textInputHint, (Object)businessInputTextContentViewArgs.textInputHint) && czd.a((Object)this.textInputError, (Object)businessInputTextContentViewArgs.textInputError) && this.inputCharacterMaxCount == businessInputTextContentViewArgs.inputCharacterMaxCount && this.textInputType == businessInputTextContentViewArgs.textInputType && czd.a((Object)this.textInputLabel, (Object)businessInputTextContentViewArgs.textInputLabel) && czd.a((Object)this.warningMessage, (Object)businessInputTextContentViewArgs.warningMessage) && czd.a((Object)this.warningUrl, (Object)businessInputTextContentViewArgs.warningUrl) && czd.a((Object)this.scribePageName, (Object)businessInputTextContentViewArgs.scribePageName) && czd.a((Object)this.validationType, (Object)businessInputTextContentViewArgs.validationType);
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
        final int f = hmg.f(this.textInputLabel, ((hmg.f(this.textInputError, hmg.f(this.textInputHint, hmg.f(this.screenTitle, hmg.f(this.inputText, hashCode * 31, 31), 31), 31), 31) + this.inputCharacterMaxCount) * 31 + this.textInputType) * 31, 31);
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
        final int f2 = hmg.f(this.scribePageName, ((f + hashCode2) * 31 + hashCode3) * 31, 31);
        final ValidationType validationType = this.validationType;
        int hashCode4;
        if (validationType == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = validationType.hashCode();
        }
        return f2 + hashCode4;
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
        final StringBuilder q = tqf.q("BusinessInputTextContentViewArgs(tag=", tag, ", inputText=", inputText, ", screenTitle=");
        nb0.z(q, screenTitle, ", textInputHint=", textInputHint, ", textInputError=");
        bo1.z(q, textInputError, ", inputCharacterMaxCount=", inputCharacterMaxCount, ", textInputType=");
        i81.x(q, textInputType, ", textInputLabel=", textInputLabel, ", warningMessage=");
        nb0.z(q, warningMessage, ", warningUrl=", warningUrl, ", scribePageName=");
        q.append(scribePageName);
        q.append(", validationType=");
        q.append(validationType);
        q.append(")");
        return q.toString();
    }
}
