// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sensitivemedia.ui.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import kotlin.Metadata;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR.\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaNoPreviewInterstitialView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "Landroid/view/View$OnClickListener;", "", "clickable", "Loyv;", "setClickable", "Landroid/widget/TextView;", "T0", "Landroid/widget/TextView;", "getShowMediaView", "()Landroid/widget/TextView;", "showMediaView", "U0", "getAlwaysShowSensitiveMediaView", "alwaysShowSensitiveMediaView", "Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaNoPreviewInterstitialView$a;", "value", "V0", "Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaNoPreviewInterstitialView$a;", "getListener", "()Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaNoPreviewInterstitialView$a;", "setListener", "(Lcom/twitter/sensitivemedia/ui/widget/SensitiveMediaNoPreviewInterstitialView$a;)V", "listener", "a", "subsystem.tfa.sensitivemedia.ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaNoPreviewInterstitialView extends LinearLayoutCompat implements View$OnClickListener
{
    public final TextView R0;
    public final TextView S0;
    public final TextView T0;
    public final TextView U0;
    public a V0;
    
    public SensitiveMediaNoPreviewInterstitialView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        this(context, set, 0);
    }
    
    public SensitiveMediaNoPreviewInterstitialView(final Context context, final AttributeSet set, final int n) {
        zzd.f((Object)context, "context");
        super(context, set, n);
        ((View)this).setBackground(qli.g(context, 2131233379));
        this.setOrientation(1);
        LayoutInflater.from(context).inflate(2131625649, (ViewGroup)this, true);
        final View viewById = ((View)this).findViewById(2131431358);
        zzd.e((Object)viewById, "findViewById(R.id.sensitive_media_title)");
        this.R0 = (TextView)viewById;
        final View viewById2 = ((View)this).findViewById(2131431355);
        zzd.e((Object)viewById2, "findViewById(R.id.sensitive_media_message)");
        this.S0 = (TextView)viewById2;
        final View viewById3 = ((View)this).findViewById(2131429957);
        zzd.e((Object)viewById3, "findViewById(R.id.media_display)");
        this.T0 = (TextView)viewById3;
        final View viewById4 = ((View)this).findViewById(2131429958);
        zzd.e((Object)viewById4, "findViewById(R.id.media_display_always)");
        this.U0 = (TextView)viewById4;
    }
    
    public final TextView getAlwaysShowSensitiveMediaView() {
        return this.U0;
    }
    
    public final a getListener() {
        return this.V0;
    }
    
    public TextView getShowMediaView() {
        return this.T0;
    }
    
    public final void onClick(final View view) {
        zzd.f((Object)view, "view");
        if (view.getId() == 2131429957) {
            final a v0 = this.V0;
            if (v0 != null) {
                v0.a();
            }
        }
        else if (view.getId() == 2131429958) {
            final a v2 = this.V0;
            if (v2 != null) {
                v2.b();
            }
        }
    }
    
    public void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        ((View)this.R0).setClickable(clickable);
        ((View)this.S0).setClickable(clickable);
        ((View)this.getShowMediaView()).setClickable(clickable);
        ((View)this.U0).setClickable(clickable);
    }
    
    public final void setListener(final a v0) {
        this.V0 = v0;
        Object o;
        if (v0 != null) {
            o = this;
        }
        else {
            o = null;
        }
        ((View)this.getShowMediaView()).setOnClickListener((View$OnClickListener)o);
        ((View)this.U0).setOnClickListener((View$OnClickListener)o);
    }
    
    public interface a extends qhp
    {
        void b();
    }
}
