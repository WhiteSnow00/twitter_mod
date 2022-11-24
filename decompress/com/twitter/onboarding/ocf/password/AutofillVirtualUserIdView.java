// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.password;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.ViewStructure;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lcom/twitter/onboarding/ocf/password/AutofillVirtualUserIdView;", "Landroid/view/View;", "", "F0", "Ljava/lang/CharSequence;", "getAutofillValue", "()Ljava/lang/CharSequence;", "setAutofillValue", "(Ljava/lang/CharSequence;)V", "autofillValue", "Companion", "a", "subsystem.tfa.ocf.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AutofillVirtualUserIdView extends View
{
    public static final a Companion;
    public CharSequence F0;
    
    static {
        Companion = new a();
    }
    
    public AutofillVirtualUserIdView(final Context context, final AttributeSet set) {
        e0e.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final CharSequence getAutofillValue() {
        return this.F0;
    }
    
    public final void onProvideAutofillVirtualStructure(ViewStructure child, int n) {
        e0e.f((Object)child, "structure");
        super.onProvideAutofillVirtualStructure(child, n);
        final AutofillId autofillId = child.getAutofillId();
        if (autofillId != null) {
            final CharSequence f0 = this.F0;
            if (f0 != null && !slr.k1(f0)) {
                n = 0;
            }
            else {
                n = 1;
            }
            if (n == 0) {
                child = child.newChild(child.addChildCount(1));
                child.setAutofillId(autofillId, 1);
                child.setAutofillHints(new String[] { "username" });
                child.setAutofillType(1);
                child.setDataIsSensitive(false);
                child.setAutofillValue(AutofillValue.forText(this.F0));
                child.setDimens(0, 0, 0, 0, 1, 1);
            }
        }
    }
    
    public final void setAutofillValue(final CharSequence f0) {
        this.F0 = f0;
    }
    
    public static final class a
    {
    }
}
