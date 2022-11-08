// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.inbox.widget;

import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a" }, d2 = { "Lcom/twitter/app/dm/inbox/widget/DMInboxRequestsPivotCompose;", "Lp9v;", "", "<set-?>", "subtitleText$delegate", "Lluh;", "getSubtitleText$feature_tfa_dm_api_legacy_release", "()Ljava/lang/String;", "setSubtitleText$feature_tfa_dm_api_legacy_release", "(Ljava/lang/String;)V", "subtitleText", "", "unreadCount$delegate", "getUnreadCount$feature_tfa_dm_api_legacy_release", "()I", "setUnreadCount$feature_tfa_dm_api_legacy_release", "(I)V", "unreadCount", "Lkotlin/Function0;", "Loyv;", "clickListener$delegate", "getClickListener$feature_tfa_dm_api_legacy_release", "()Lotb;", "setClickListener$feature_tfa_dm_api_legacy_release", "(Lotb;)V", "clickListener", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMInboxRequestsPivotCompose extends p9v
{
    public final cwj J0;
    public final cwj K0;
    public final cwj L0;
    
    public DMInboxRequestsPivotCompose(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        this.J0 = (cwj)nkz.r((Object)null);
        this.K0 = (cwj)nkz.r((Object)0);
        this.L0 = (cwj)nkz.r((Object)pq7.C0);
    }
    
    public final otb<oyv> getClickListener$feature_tfa_dm_api_legacy_release() {
        return (otb<oyv>)((nhq)this.L0).getValue();
    }
    
    public final String getSubtitleText$feature_tfa_dm_api_legacy_release() {
        return (String)((nhq)this.J0).getValue();
    }
    
    public final int getUnreadCount$feature_tfa_dm_api_legacy_release() {
        return ((Number)((nhq)this.K0).getValue()).intValue();
    }
    
    public final void j(m76 h, final int n) {
        h = h.h(-2010388102);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)this)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            qq7.a(this.getUnreadCount$feature_tfa_dm_api_legacy_release(), this.getSubtitleText$feature_tfa_dm_api_legacy_release(), this.getClickListener$feature_tfa_dm_api_legacy_release(), null, h, 0, 8);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final /* synthetic */ DMInboxRequestsPivotCompose C0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    this.C0.j(m76, n | 0x1);
                    return oyv.a;
                }
            });
        }
    }
    
    public final void setClickListener$feature_tfa_dm_api_legacy_release(final otb<oyv> value) {
        zzd.f((Object)value, "<set-?>");
        ((nhq)this.L0).setValue((Object)value);
    }
    
    public final void setSubtitleText$feature_tfa_dm_api_legacy_release(final String value) {
        ((nhq)this.J0).setValue((Object)value);
    }
    
    public final void setUnreadCount$feature_tfa_dm_api_legacy_release(final int n) {
        ((nhq)this.K0).setValue((Object)n);
    }
}
