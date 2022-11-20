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

public final class pid extends a3e<fp7$a, a>
{
    public final Context d;
    public final UserIdentifier e;
    public final to7 f;
    public final sjq g;
    public final ihd h;
    
    public pid(final Context d, final UserIdentifier e, final to7 f, final sjq g, final ihd h) {
        super((Class)fp7$a.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void k(final v7x v7x, Object next, final xbm xbm) {
        final a a = (a)v7x;
        final fp7$a fp7$a = (fp7$a)next;
        czd.f((Object)a, "viewHolder");
        czd.f((Object)fp7$a, "conversation");
        final qo7 a2 = fp7$a.a;
        final int c = fp7$a.c;
        final List<cgv> a3 = a2.a();
        final ArrayList d = ib0.D((List)a3, "dmInboxItem.users");
        final Iterator<Object> iterator = a3.iterator();
        int n;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            n = 0;
            final int n2 = 0;
            if (!hasNext) {
                break;
            }
            next = iterator.next();
            int n3 = n2;
            if (((cgv)next).D0 != UserIdentifier.Companion.c().getId()) {
                n3 = 1;
            }
            if (n3 == 0) {
                continue;
            }
            d.add(next);
        }
        final int size = d.size();
        final Object a4 = a.F0.a((Object)fp7$a.a);
        czd.e(a4, "conversationTitleFactory\u2026conversation.dmInboxItem)");
        final String conversationTitle$feature_tfa_dm_api_legacy_release = (String)a4;
        final List<kt6> u = a2.u;
        final ArrayList d2 = ib0.D((List)u, "dmInboxItem.conversationSocialProof");
        for (final Object next2 : u) {
            if (next2 instanceof lt6) {
                d2.add(next2);
            }
        }
        final lt6 lt6 = (lt6)mq4.i0((List)d2);
        Object o;
        if (lt6 == null || (o = lt6.e) == null) {
            o = f2a.D0;
        }
        if (lt6 != null) {
            n = lt6.c - 2;
        }
        final sjq i0 = a.I0;
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator iterator3 = ((Iterable)o).iterator();
        while (iterator3.hasNext()) {
            final String c2 = ((cgv)iterator3.next()).c();
            if (c2 != null) {
                list.add(c2);
            }
        }
        String a5 = i0.a((List)list, n);
        final String o2 = yqs.o(a.E0, a2.f);
        final cid$a cid$a = new cid$a();
        cid$a.a = a2;
        cid$a.b = a.E0;
        cid$a.c = a.H0;
        final CharSequence b = ((cid)((n4j)cid$a).e()).b();
        czd.e((Object)b, "Builder()\n              \u2026()\n                .get()");
        next = new cid$a();
        ((cid$a)next).a = a2;
        ((cid$a)next).b = a.E0;
        ((cid$a)next).c = a.H0;
        ((cid$a)next).d = Boolean.TRUE;
        final CharSequence b2 = ((cid)((n4j)next).e()).b();
        czd.e((Object)b2, "Builder()\n              \u2026()\n                .get()");
        a.K0.setDmInboxItem$feature_tfa_dm_api_legacy_release(a2);
        a.K0.setConversationTitle$feature_tfa_dm_api_legacy_release(conversationTitle$feature_tfa_dm_api_legacy_release);
        a.K0.setNonOwnerUserCount$feature_tfa_dm_api_legacy_release(Integer.valueOf(size));
        a.K0.setPreviewText$feature_tfa_dm_api_legacy_release(b);
        a.K0.setSocialProofText$feature_tfa_dm_api_legacy_release(a5);
        final InboxRequestItemCompose k0 = a.K0;
        final ihd j0 = a.J0;
        final boolean g = a2.g;
        String b3;
        if ((b3 = a2.b) == null) {
            b3 = "";
        }
        String s;
        if ((s = o2) == null) {
            s = "";
        }
        final List<cgv> a6 = a2.a();
        czd.e((Object)a6, "dmInboxItem.users");
        if (a5 == null) {
            a5 = "";
        }
        k0.setCellContentDescription$feature_tfa_dm_api_legacy_release(j0.a(g, size, b3, conversationTitle$feature_tfa_dm_api_legacy_release, s, (List)a6, a5, b2.toString(), a2.e, a2.i));
        a.K0.setContentClickListener$feature_tfa_dm_api_legacy_release((nsb)new qid(a, fp7$a));
        a.K0.setAvatarClickListener$feature_tfa_dm_api_legacy_release((nsb)new rid(a2, a));
        a.K0.setDeleteRequestClickListener$feature_tfa_dm_api_legacy_release((nsb)new sid(a, a2, c));
        a.K0.setContentLongClickListener$feature_tfa_dm_api_legacy_release((nsb)new tid(a, fp7$a));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        final pt6 pt6 = new pt6(this.d, this.e);
        final ViewGroup viewGroup2 = (ViewGroup)da8.h(viewGroup, 2131624321, viewGroup, false);
        final Map a = h91.e().a();
        final Resources resources = this.d.getResources();
        czd.e((Object)resources, "context.resources");
        return (v7x)new a(resources, viewGroup2, (ypa<qo7, String>)pt6, this.f, a, this.g, this.h);
    }
    
    public static final class a extends nk8
    {
        public static final pid.a.a Companion;
        public final Resources E0;
        public final ypa<qo7, String> F0;
        public final to7 G0;
        public final Map<String, df6> H0;
        public final sjq I0;
        public final ihd J0;
        public final InboxRequestItemCompose K0;
        
        static {
            Companion = new pid.a.a();
        }
        
        public a(final Resources e0, final ViewGroup viewGroup, final ypa<qo7, String> f0, final to7 g0, final Map<String, df6> h0, final sjq i0, final ihd j0) {
            czd.f((Object)viewGroup, "viewGroup");
            czd.f((Object)h0, "emojiLookup");
            czd.f((Object)i0, "socialProofTextResolver");
            czd.f((Object)j0, "inboxAccessibilityHelper");
            super((View)viewGroup);
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
            final FrameLayout frameLayout = (FrameLayout)viewGroup;
            final View viewById = ((View)viewGroup).findViewById(2131429552);
            czd.e((Object)viewById, "viewGroup.findViewById(R\u2026nbox_request_row_compose)");
            this.K0 = (InboxRequestItemCompose)viewById;
        }
        
        public static final class a
        {
        }
    }
}
