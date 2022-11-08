import android.widget.FrameLayout;
import android.view.View;
import android.content.res.Resources;
import java.util.Map;
import android.view.ViewGroup;
import com.twitter.app.dm.inbox.widget.InboxRequestItemCompose;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njd extends v3e<yp7$a, a>
{
    public final Context d;
    public final UserIdentifier e;
    public final mp7 f;
    public final ajq g;
    public final fid h;
    
    public njd(final Context d, final UserIdentifier e, final mp7 f, final ajq g, final fid h) {
        super((Class)yp7$a.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void k(final c7x c7x, Object o, final ibm ibm) {
        final a a = (a)c7x;
        final yp7$a yp7$a = (yp7$a)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)yp7$a, "conversation");
        final jp7 a2 = yp7$a.a;
        final int c = yp7$a.c;
        final List a3 = a2.a();
        final ArrayList c2 = nb0.C(a3, "dmInboxItem.users");
        final Iterator iterator = a3.iterator();
        int n;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            n = 0;
            final int n2 = 0;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            int n3 = n2;
            if (((hfv)next).C0 != UserIdentifier.Companion.c().getId()) {
                n3 = 1;
            }
            if (n3 == 0) {
                continue;
            }
            c2.add(next);
        }
        final int size = c2.size();
        final Object a4 = a.E0.a((Object)yp7$a.a);
        zzd.e(a4, "conversationTitleFactory\u2026conversation.dmInboxItem)");
        final String conversationTitle$feature_tfa_dm_api_legacy_release = (String)a4;
        final List u = a2.u;
        final ArrayList c3 = nb0.C(u, "dmInboxItem.conversationSocialProof");
        for (final Object next2 : u) {
            if (next2 instanceof gu6) {
                c3.add(next2);
            }
        }
        final gu6 gu6 = (gu6)or4.I1((List)c3);
        Object o2;
        if (gu6 == null || (o2 = gu6.e) == null) {
            o2 = v2a.C0;
        }
        if (gu6 != null) {
            n = gu6.c - 2;
        }
        final ajq h0 = a.H0;
        o = new ArrayList();
        final Iterator iterator3 = ((Iterable)o2).iterator();
        while (iterator3.hasNext()) {
            final String c4 = ((hfv)iterator3.next()).c();
            if (c4 != null) {
                ((ArrayList<String>)o).add(c4);
            }
        }
        String a5 = h0.a((List)o, n);
        final String o3 = hqs.o(a.D0, a2.f);
        final ajd$a ajd$a = new ajd$a();
        ajd$a.a = a2;
        ajd$a.b = a.D0;
        ajd$a.c = a.G0;
        final CharSequence b = ((ajd)((h4j)ajd$a).e()).b();
        zzd.e((Object)b, "Builder()\n              \u2026()\n                .get()");
        o = new ajd$a();
        ((ajd$a)o).a = a2;
        ((ajd$a)o).b = a.D0;
        ((ajd$a)o).c = a.G0;
        ((ajd$a)o).d = Boolean.TRUE;
        final CharSequence b2 = ((ajd)((h4j)o).e()).b();
        zzd.e((Object)b2, "Builder()\n              \u2026()\n                .get()");
        a.J0.setDmInboxItem$feature_tfa_dm_api_legacy_release(a2);
        a.J0.setConversationTitle$feature_tfa_dm_api_legacy_release(conversationTitle$feature_tfa_dm_api_legacy_release);
        a.J0.setNonOwnerUserCount$feature_tfa_dm_api_legacy_release(size);
        a.J0.setPreviewText$feature_tfa_dm_api_legacy_release(b);
        a.J0.setSocialProofText$feature_tfa_dm_api_legacy_release(a5);
        final InboxRequestItemCompose j0 = a.J0;
        final fid i0 = a.I0;
        final boolean g = a2.g;
        String b3;
        if ((b3 = a2.b) == null) {
            b3 = "";
        }
        String s;
        if ((s = o3) == null) {
            s = "";
        }
        final List a6 = a2.a();
        zzd.e((Object)a6, "dmInboxItem.users");
        if (a5 == null) {
            a5 = "";
        }
        j0.setCellContentDescription$feature_tfa_dm_api_legacy_release(i0.a(g, size, b3, conversationTitle$feature_tfa_dm_api_legacy_release, s, a6, a5, b2.toString(), a2.e, a2.i));
        a.J0.setContentClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new ojd(a, yp7$a));
        a.J0.setAvatarClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new pjd(a2, a));
        a.J0.setDeleteRequestClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new qjd(a, a2, c));
        a.J0.setContentLongClickListener$feature_tfa_dm_api_legacy_release((otb<oyv>)new rjd(a, yp7$a));
    }
    
    public final c7x l(ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final ku6 ku6 = new ku6(this.d, this.e);
        viewGroup = (ViewGroup)w30.B(viewGroup, 2131624321, viewGroup, false);
        final Map<String, yf6> a = y70.b().a();
        final Resources resources = this.d.getResources();
        zzd.e((Object)resources, "context.resources");
        return (c7x)new a(resources, viewGroup, (bra<jp7, String>)ku6, this.f, a, this.g, this.h);
    }
    
    public static final class a extends el8
    {
        public static final a.njd$a$a Companion;
        public final Resources D0;
        public final bra<jp7, String> E0;
        public final mp7 F0;
        public final Map<String, yf6> G0;
        public final ajq H0;
        public final fid I0;
        public final InboxRequestItemCompose J0;
        
        static {
            Companion = new a.njd$a$a();
        }
        
        public a(final Resources d0, final ViewGroup viewGroup, final bra<jp7, String> e0, final mp7 f0, final Map<String, yf6> g0, final ajq h0, final fid i0) {
            zzd.f((Object)viewGroup, "viewGroup");
            zzd.f((Object)g0, "emojiLookup");
            zzd.f((Object)h0, "socialProofTextResolver");
            zzd.f((Object)i0, "inboxAccessibilityHelper");
            super((View)viewGroup);
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            final FrameLayout frameLayout = (FrameLayout)viewGroup;
            final View viewById = ((View)viewGroup).findViewById(2131429552);
            zzd.e((Object)viewById, "viewGroup.findViewById(R\u2026nbox_request_row_compose)");
            this.J0 = (InboxRequestItemCompose)viewById;
        }
    }
}
