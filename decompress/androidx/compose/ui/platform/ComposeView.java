// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Landroidx/compose/ui/platform/ComposeView;", "Lgb;", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Loyv;", "content", "setContent", "(Lgub;)V", "", "<set-?>", "K0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class ComposeView extends gb
{
    public final luh<gub<m76, Integer, oyv>> J0;
    public boolean K0;
    
    public ComposeView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        this(context, set, 4);
    }
    
    public ComposeView(final Context context, AttributeSet set, final int n) {
        if ((n & 0x2) != 0x0) {
            set = null;
        }
        zzd.f((Object)context, "context");
        super(context, set, 0);
        this.J0 = (cwj)nkz.r((Object)null);
    }
    
    public final void a(m76 h, final int n) {
        h = h.h(420213850);
        final ea6$b a = ea6.a;
        final gub gub = (gub)((nhq)this.J0).getValue();
        if (gub != null) {
            gub.invoke((Object)h, (Object)0);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new ComposeView$a(this, n));
        }
    }
    
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.K0;
    }
    
    public final void setContent(final gub<? super m76, ? super Integer, oyv> value) {
        zzd.f((Object)value, "content");
        this.K0 = true;
        ((nhq)this.J0).setValue((Object)value);
        if (((View)this).isAttachedToWindow()) {
            this.c();
        }
    }
}
