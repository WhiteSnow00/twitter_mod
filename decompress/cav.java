import tv.periscope.android.api.PsUser;
import tv.periscope.android.api.PsRequest;
import tv.periscope.android.api.AuthedApiService;
import java.util.Iterator;
import tv.periscope.android.api.PsInviteMetaResponse;
import tv.periscope.chatman.api.IdempotenceHeaderMap;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.InviteMetaRequest;
import java.util.Collection;
import java.util.ArrayList;
import tv.periscope.android.api.Invitee;
import java.util.List;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cav implements mj2
{
    public static final cav.cav$a Companion;
    public final o3k a;
    public final xmp b;
    public final ogw c;
    public final UserIdentifier d;
    public final uei e;
    public final trc f;
    public final uaq<eur, ixl> g;
    public final wc6 h;
    public liv i;
    
    static {
        Companion = new cav.cav$a();
    }
    
    public cav(final Context context, final o3k a, final xmp b, final ogw c, final UserIdentifier d, final uei e, final trc f, final uaq<eur, ixl> g, final xbm xbm) {
        czd.f((Object)context, "context");
        czd.f((Object)a, "periscopeApiManager");
        czd.f((Object)b, "sessionCache");
        czd.f((Object)c, "userProvider");
        czd.f((Object)d, "userIdentifier");
        czd.f((Object)e, "newDMRequestDataSource");
        czd.f((Object)f, "httpRequestController");
        czd.f((Object)g, "rankedSuggestionDataSource");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new wc6();
        xbm.i((oj)new qt1((Object)this, 2));
        this.i = new liv(context, d, "compose_message");
    }
    
    public final eaq<List<Invitee>> a(final String s) {
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        eaq eaq;
        if (s2.length() == 0) {
            eaq = this.d("");
        }
        else {
            final h5j p = this.d(s2).P();
            final h5j create = h5j.create((h9j)new aav(this, s2));
            czd.e((Object)create, "create { subscriber ->\n \u2026)\n            }\n        }");
            eaq = h5j.concat((taj)p, (taj)create).take(30L).collectInto((Object)new ArrayList(), (xv1)new dm9((Object)dav.D0, 5)).w((psb)new ti4((qsb)eav.D0, 1)).I(owo.c()).y(gmw.H());
        }
        return (eaq<List<Invitee>>)eaq;
    }
    
    public final eaq<List<qhp>> b(final String broadcastId, final List<Invitee> list) {
        czd.f((Object)broadcastId, "broadcastId");
        final ArrayList list2 = new ArrayList((Collection<? extends E>)list);
        final InviteMetaRequest inviteMetaRequest = new InviteMetaRequest();
        String b;
        if ((b = this.b.b()) == null) {
            b = "";
        }
        ((PsRequest)inviteMetaRequest).cookie = b;
        inviteMetaRequest.broadcastId = broadcastId;
        final ArrayList bluebirdInvitees = new ArrayList<Long>(iq4.H((Iterable)list2, 10));
        final Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            final String id = ((PsUser)iterator.next()).id;
            czd.e((Object)id, "it.id");
            bluebirdInvitees.add(Long.parseLong(id));
        }
        inviteMetaRequest.bluebirdInvitees = bluebirdInvitees;
        this.b.d();
        list2.toString();
        final AuthedApiService authedApiService = this.a.authedApiService();
        final wmp d = this.b.d();
        boolean b2 = false;
        int c;
        if (d != null) {
            c = d.c;
        }
        else {
            c = 0;
        }
        if (c == 3) {
            b2 = true;
        }
        return (eaq<List<qhp>>)new kbq((lcq)authedApiService.addInvitee(inviteMetaRequest, b2, (IdempotenceHeaderMap)IdempotenceHeaderMapImpl.Companion.create()).I(owo.c()).y(gmw.H()), (psb)new ti4((qsb)new qsb<PsInviteMetaResponse, lcq<? extends List<? extends qhp>>>(this, list2) {
            public final cav D0;
            public final ArrayList<Invitee> E0;
            
            public final Object invoke(final Object o) {
                final PsInviteMetaResponse psInviteMetaResponse = (PsInviteMetaResponse)o;
                czd.f((Object)psInviteMetaResponse, "it");
                return this.D0.c(psInviteMetaResponse.getUrl(), this.E0);
            }
        }, 2));
    }
    
    public final eaq<List<qhp>> c(final String s, final List<Invitee> list) {
        czd.f((Object)s, "shareUrl");
        czd.f((Object)list, "invitees");
        return (eaq<List<qhp>>)h5j.fromIterable((Iterable)list).flatMapSingle((psb)new x9v((qsb)new cav$j(this, s), 0)).collectInto((Object)new ArrayList(), (xv1)new v9v((ftb)cav$k.D0, 0)).w((psb)new di((qsb)cav$l.D0, 3));
    }
    
    public final eaq<List<Invitee>> d(final String s) {
        final h5j flatMap = this.g.R((Object)new eur(a48.k(s), false)).P().map((psb)new ui4((qsb)cav$g.D0, 2)).flatMap((psb)new x9v((qsb)cav$h.D0, 1)).flatMap((psb)new y9v((qsb)cav$i.D0, 0));
        final h5j create = h5j.create((h9j)new z9v(this, s));
        czd.e((Object)create, "create<TwitterUser> { em\u2026er.onComplete()\n        }");
        return (eaq<List<Invitee>>)h5j.concat((taj)flatMap, (taj)create).filter((ytk)new vt1((qsb)new qsb<cgv, Boolean>(this) {
            public final cav D0;
            
            public final Object invoke(final Object o) {
                final cgv cgv = (cgv)o;
                czd.f((Object)cgv, "it");
                return a48.h(cgv) && cgv.D0 != this.D0.d.getId();
            }
        }, 2)).map((psb)new ut1((qsb)cav$d.D0, 5)).take(30L).collectInto((Object)new ArrayList(), (xv1)new w9v((ftb)cav$e.D0, 0)).w((psb)new ola((qsb)cav$f.D0, 1)).I(owo.c()).y(gmw.H());
    }
}
