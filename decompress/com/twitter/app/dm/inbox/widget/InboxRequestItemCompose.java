// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.inbox.widget;

import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R/\u0010#\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001d8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R/\u0010'\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R7\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0(8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0005\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R7\u00103\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0(8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0005\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R7\u00107\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0(8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0005\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R7\u0010;\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0(8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0005\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.¨\u0006<" }, d2 = { "Lcom/twitter/app/dm/inbox/widget/InboxRequestItemCompose;", "Lp9v;", "Ljp7;", "<set-?>", "dmInboxItem$delegate", "Lluh;", "getDmInboxItem$feature_tfa_dm_api_legacy_release", "()Ljp7;", "setDmInboxItem$feature_tfa_dm_api_legacy_release", "(Ljp7;)V", "dmInboxItem", "", "conversationTitle$delegate", "getConversationTitle$feature_tfa_dm_api_legacy_release", "()Ljava/lang/String;", "setConversationTitle$feature_tfa_dm_api_legacy_release", "(Ljava/lang/String;)V", "conversationTitle", "", "nonOwnerUserCount$delegate", "getNonOwnerUserCount$feature_tfa_dm_api_legacy_release", "()Ljava/lang/Integer;", "setNonOwnerUserCount$feature_tfa_dm_api_legacy_release", "(Ljava/lang/Integer;)V", "nonOwnerUserCount", "cellContentDescription$delegate", "getCellContentDescription$feature_tfa_dm_api_legacy_release", "setCellContentDescription$feature_tfa_dm_api_legacy_release", "cellContentDescription", "", "previewText$delegate", "getPreviewText$feature_tfa_dm_api_legacy_release", "()Ljava/lang/CharSequence;", "setPreviewText$feature_tfa_dm_api_legacy_release", "(Ljava/lang/CharSequence;)V", "previewText", "socialProofText$delegate", "getSocialProofText$feature_tfa_dm_api_legacy_release", "setSocialProofText$feature_tfa_dm_api_legacy_release", "socialProofText", "Lkotlin/Function0;", "Loyv;", "avatarClickListener$delegate", "getAvatarClickListener$feature_tfa_dm_api_legacy_release", "()Lotb;", "setAvatarClickListener$feature_tfa_dm_api_legacy_release", "(Lotb;)V", "avatarClickListener", "contentClickListener$delegate", "getContentClickListener$feature_tfa_dm_api_legacy_release", "setContentClickListener$feature_tfa_dm_api_legacy_release", "contentClickListener", "contentLongClickListener$delegate", "getContentLongClickListener$feature_tfa_dm_api_legacy_release", "setContentLongClickListener$feature_tfa_dm_api_legacy_release", "contentLongClickListener", "deleteRequestClickListener$delegate", "getDeleteRequestClickListener$feature_tfa_dm_api_legacy_release", "setDeleteRequestClickListener$feature_tfa_dm_api_legacy_release", "deleteRequestClickListener", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class InboxRequestItemCompose extends p9v
{
    public final cwj J0;
    public final cwj K0;
    public final cwj L0;
    public final cwj M0;
    public final cwj N0;
    public final cwj O0;
    public final cwj P0;
    public final cwj Q0;
    public final cwj R0;
    public final cwj S0;
    
    public InboxRequestItemCompose(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        this.J0 = (cwj)nkz.r((Object)null);
        this.K0 = (cwj)nkz.r((Object)null);
        this.L0 = (cwj)nkz.r((Object)null);
        this.M0 = (cwj)nkz.r((Object)null);
        this.N0 = (cwj)nkz.r((Object)null);
        this.O0 = (cwj)nkz.r((Object)null);
        this.P0 = (cwj)nkz.r((Object)sjd.C0);
        this.Q0 = (cwj)nkz.r((Object)tjd.C0);
        this.R0 = (cwj)nkz.r((Object)ujd.C0);
        this.S0 = (cwj)nkz.r((Object)vjd.C0);
    }
    
    public final otb<oyv> getAvatarClickListener$feature_tfa_dm_api_legacy_release() {
        return (otb<oyv>)((nhq)this.P0).getValue();
    }
    
    public final String getCellContentDescription$feature_tfa_dm_api_legacy_release() {
        return (String)((nhq)this.M0).getValue();
    }
    
    public final otb<oyv> getContentClickListener$feature_tfa_dm_api_legacy_release() {
        return (otb<oyv>)((nhq)this.Q0).getValue();
    }
    
    public final otb<oyv> getContentLongClickListener$feature_tfa_dm_api_legacy_release() {
        return (otb<oyv>)((nhq)this.R0).getValue();
    }
    
    public final String getConversationTitle$feature_tfa_dm_api_legacy_release() {
        return (String)((nhq)this.K0).getValue();
    }
    
    public final otb<oyv> getDeleteRequestClickListener$feature_tfa_dm_api_legacy_release() {
        return (otb<oyv>)((nhq)this.S0).getValue();
    }
    
    public final jp7 getDmInboxItem$feature_tfa_dm_api_legacy_release() {
        return (jp7)((nhq)this.J0).getValue();
    }
    
    public final Integer getNonOwnerUserCount$feature_tfa_dm_api_legacy_release() {
        return (Integer)((nhq)this.L0).getValue();
    }
    
    public final CharSequence getPreviewText$feature_tfa_dm_api_legacy_release() {
        return (CharSequence)((nhq)this.N0).getValue();
    }
    
    public final String getSocialProofText$feature_tfa_dm_api_legacy_release() {
        return (String)((nhq)this.O0).getValue();
    }
    
    public final void j(m76 h, final int n) {
        h = h.h(1208326490);
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
            final jp7 dmInboxItem$feature_tfa_dm_api_legacy_release = this.getDmInboxItem$feature_tfa_dm_api_legacy_release();
            if (dmInboxItem$feature_tfa_dm_api_legacy_release == null) {
                final vwo k = h.k();
                if (k != null) {
                    k.a((gub)new gub<m76, Integer, oyv>() {
                        public final /* synthetic */ InboxRequestItemCompose C0;
                        
                        public final Object invoke(final Object o, final Object o2) {
                            final m76 m76 = (m76)o;
                            ((Number)o2).intValue();
                            this.C0.j(m76, n | 0x1);
                            return oyv.a;
                        }
                    });
                }
                return;
            }
            final String conversationTitle$feature_tfa_dm_api_legacy_release = this.getConversationTitle$feature_tfa_dm_api_legacy_release();
            if (conversationTitle$feature_tfa_dm_api_legacy_release == null) {
                final vwo i = h.k();
                if (i != null) {
                    i.a((gub)new gub<m76, Integer, oyv>() {
                        public final /* synthetic */ InboxRequestItemCompose C0;
                        
                        public final Object invoke(final Object o, final Object o2) {
                            final m76 m76 = (m76)o;
                            ((Number)o2).intValue();
                            this.C0.j(m76, n | 0x1);
                            return oyv.a;
                        }
                    });
                }
                return;
            }
            final Integer nonOwnerUserCount$feature_tfa_dm_api_legacy_release = this.getNonOwnerUserCount$feature_tfa_dm_api_legacy_release();
            if (nonOwnerUserCount$feature_tfa_dm_api_legacy_release == null) {
                final vwo j = h.k();
                if (j != null) {
                    j.a((gub)new gub<m76, Integer, oyv>() {
                        public final /* synthetic */ InboxRequestItemCompose C0;
                        
                        public final Object invoke(final Object o, final Object o2) {
                            final m76 m76 = (m76)o;
                            ((Number)o2).intValue();
                            this.C0.j(m76, n | 0x1);
                            return oyv.a;
                        }
                    });
                }
                return;
            }
            final int intValue = nonOwnerUserCount$feature_tfa_dm_api_legacy_release;
            final CharSequence previewText$feature_tfa_dm_api_legacy_release = this.getPreviewText$feature_tfa_dm_api_legacy_release();
            if (previewText$feature_tfa_dm_api_legacy_release == null) {
                final vwo l = h.k();
                if (l != null) {
                    l.a((gub)new gub<m76, Integer, oyv>() {
                        public final /* synthetic */ InboxRequestItemCompose C0;
                        
                        public final Object invoke(final Object o, final Object o2) {
                            final m76 m76 = (m76)o;
                            ((Number)o2).intValue();
                            this.C0.j(m76, n | 0x1);
                            return oyv.a;
                        }
                    });
                }
                return;
            }
            wjd.a(dmInboxItem$feature_tfa_dm_api_legacy_release, conversationTitle$feature_tfa_dm_api_legacy_release, intValue, this.getCellContentDescription$feature_tfa_dm_api_legacy_release(), previewText$feature_tfa_dm_api_legacy_release, this.getSocialProofText$feature_tfa_dm_api_legacy_release(), (otb)this.getAvatarClickListener$feature_tfa_dm_api_legacy_release(), (otb)this.getContentClickListener$feature_tfa_dm_api_legacy_release(), (otb)this.getContentLongClickListener$feature_tfa_dm_api_legacy_release(), (otb)this.getDeleteRequestClickListener$feature_tfa_dm_api_legacy_release(), (jkh)null, h, 32776, 0, 1024);
        }
        final vwo m = h.k();
        if (m != null) {
            m.a((gub)new gub<m76, Integer, oyv>() {
                public final /* synthetic */ InboxRequestItemCompose C0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    this.C0.j(m76, n | 0x1);
                    return oyv.a;
                }
            });
        }
    }
    
    public final void setAvatarClickListener$feature_tfa_dm_api_legacy_release(final otb<oyv> value) {
        zzd.f((Object)value, "<set-?>");
        ((nhq)this.P0).setValue((Object)value);
    }
    
    public final void setCellContentDescription$feature_tfa_dm_api_legacy_release(final String value) {
        ((nhq)this.M0).setValue((Object)value);
    }
    
    public final void setContentClickListener$feature_tfa_dm_api_legacy_release(final otb<oyv> value) {
        zzd.f((Object)value, "<set-?>");
        ((nhq)this.Q0).setValue((Object)value);
    }
    
    public final void setContentLongClickListener$feature_tfa_dm_api_legacy_release(final otb<oyv> value) {
        zzd.f((Object)value, "<set-?>");
        ((nhq)this.R0).setValue((Object)value);
    }
    
    public final void setConversationTitle$feature_tfa_dm_api_legacy_release(final String value) {
        ((nhq)this.K0).setValue((Object)value);
    }
    
    public final void setDeleteRequestClickListener$feature_tfa_dm_api_legacy_release(final otb<oyv> value) {
        zzd.f((Object)value, "<set-?>");
        ((nhq)this.S0).setValue((Object)value);
    }
    
    public final void setDmInboxItem$feature_tfa_dm_api_legacy_release(final jp7 value) {
        ((nhq)this.J0).setValue((Object)value);
    }
    
    public final void setNonOwnerUserCount$feature_tfa_dm_api_legacy_release(final Integer value) {
        ((nhq)this.L0).setValue((Object)value);
    }
    
    public final void setPreviewText$feature_tfa_dm_api_legacy_release(final CharSequence value) {
        ((nhq)this.N0).setValue((Object)value);
    }
    
    public final void setSocialProofText$feature_tfa_dm_api_legacy_release(final String value) {
        ((nhq)this.O0).setValue((Object)value);
    }
}
