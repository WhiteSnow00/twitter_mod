import android.widget.FrameLayout;
import android.view.View;
import android.content.res.Resources;
import java.util.Map;
import android.view.ViewGroup;
import com.twitter.app.dm.inbox.widget.InboxItemCompose;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yid extends v3e<yp7$a, a>
{
    public final UserIdentifier d;
    public final Context e;
    public final mp7 f;
    public final fid g;
    
    public yid(final UserIdentifier d, final Context e, final mp7 f, final fid g) {
        super((Class)yp7$a.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final yp7$a yp7$a = (yp7$a)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)yp7$a, "conversation");
        final jp7 a2 = yp7$a.a;
        final List a3 = a2.a();
        final ArrayList c = nb0.C(a3, "dmInboxItem.users");
        for (final Object next : a3) {
            if (((hfv)next).C0 != UserIdentifier.Companion.c().getId()) {
                c.add(next);
            }
        }
        final int size = c.size();
        final Object a4 = a.E0.a((Object)yp7$a.a);
        zzd.e(a4, "conversationTitleFactory\u2026conversation.dmInboxItem)");
        final String conversationTitle$feature_tfa_dm_api_legacy_release = (String)a4;
        String o2 = hqs.o(a.D0, a2.f);
        final ajd$a ajd$a = new ajd$a();
        ajd$a.a = a2;
        ajd$a.b = a.D0;
        ajd$a.c = a.G0;
        final CharSequence b = ((ajd)((h4j)ajd$a).e()).b();
        zzd.e((Object)b, "Builder()\n              \u2026()\n                .get()");
        final ajd$a ajd$a2 = new ajd$a();
        ajd$a2.a = a2;
        ajd$a2.b = a.D0;
        ajd$a2.c = a.G0;
        ajd$a2.d = Boolean.TRUE;
        final CharSequence b2 = ((ajd)((h4j)ajd$a2).e()).b();
        zzd.e((Object)b2, "Builder()\n              \u2026()\n                .get()");
        a.I0.setDmInboxItem$feature_tfa_dm_api_legacy_release(a2);
        a.I0.setConversationTitle$feature_tfa_dm_api_legacy_release(conversationTitle$feature_tfa_dm_api_legacy_release);
        a.I0.setNonOwnerUserCount$feature_tfa_dm_api_legacy_release(size);
        a.I0.setPreviewText$feature_tfa_dm_api_legacy_release(b);
        final InboxItemCompose i0 = a.I0;
        final fid h0 = a.H0;
        final boolean g = a2.g;
        String b3;
        if ((b3 = a2.b) == null) {
            b3 = "";
        }
        if (o2 == null) {
            o2 = "";
        }
        final List a5 = a2.a();
        zzd.e((Object)a5, "dmInboxItem.users");
        i0.setCellContentDescription$feature_tfa_dm_api_legacy_release(h0.a(g, size, b3, conversationTitle$feature_tfa_dm_api_legacy_release, o2, a5, "", b2.toString(), a2.e, a2.i));
        a.I0.setContentClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new vid(a, yp7$a));
        a.I0.setContentLongClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new wid(a, yp7$a));
        a.I0.setAvatarClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new xid(a2, a));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final ku6 ku6 = new ku6(this.e, this.d);
        final ViewGroup viewGroup2 = (ViewGroup)w30.B(viewGroup, 2131624324, viewGroup, false);
        final Map<String, yf6> a = y70.b().a();
        final Resources resources = this.e.getResources();
        zzd.e((Object)resources, "context.resources");
        return (c7x)new a(resources, viewGroup2, (bra<jp7, String>)ku6, this.f, a, this.g);
    }
    
    public static final class a extends el8
    {
        public final Resources D0;
        public final bra<jp7, String> E0;
        public final mp7 F0;
        public final Map<String, yf6> G0;
        public final fid H0;
        public final InboxItemCompose I0;
        
        public a(final Resources d0, final ViewGroup viewGroup, final bra<jp7, String> e0, final mp7 f0, final Map<String, yf6> g0, final fid h0) {
            zzd.f((Object)viewGroup, "viewGroup");
            zzd.f((Object)g0, "emojiLookup");
            zzd.f((Object)h0, "inboxAccessibilityHelper");
            super((View)viewGroup);
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            final FrameLayout frameLayout = (FrameLayout)viewGroup;
            final View viewById = ((View)viewGroup).findViewById(2131429553);
            zzd.e((Object)viewById, "viewGroup.findViewById(R.id.inbox_row_compose)");
            this.I0 = (InboxItemCompose)viewById;
        }
    }
}
