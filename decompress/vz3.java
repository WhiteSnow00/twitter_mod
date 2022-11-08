// 
// Decompiled by Procyon v0.6.0
// 

public final class vz3 implements xq<sz3>
{
    public static final vz3 a;
    
    static {
        a = new vz3();
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }
    
    public final void c(final qle qle, final bb7 bb7, final sz3 sz3) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)sz3, "value");
        qle.A1("conversation_id");
        ar.a.a(qle, bb7, (Object)sz3.a);
        if (sz3.b instanceof rnj$c) {
            qle.A1("slice_view");
            ar.d(ar.b((xq<Object>)new g4j((xq)wn7.a, false))).c(qle, bb7, (rnj$c)sz3.b);
        }
        qle.A1("include_dm_recipient");
        final ar$b f = ar.f;
        f.a(qle, bb7, (Object)sz3.c);
        qle.A1("include_type_name");
        f.a(qle, bb7, (Object)sz3.d);
        qle.A1("include_dm_muting");
        f.a(qle, bb7, (Object)sz3.e);
        qle.A1("include_viewer_quick_promote_eligibility");
        f.a(qle, bb7, (Object)sz3.f);
        qle.A1("include_professional");
        f.a(qle, bb7, (Object)sz3.g);
        qle.A1("includeHasConversationContext");
        f.a(qle, bb7, (Object)sz3.h);
        qle.A1("includeHasBirdwatchNotes");
        f.a(qle, bb7, (Object)sz3.i);
        qle.A1("includeTweetImpression");
        f.a(qle, bb7, (Object)sz3.j);
        qle.A1("includeUnifiedCard");
        f.a(qle, bb7, (Object)sz3.k);
        if (sz3.l instanceof rnj$c) {
            qle.A1("display_location");
            ar.d(ar.b((xq<Object>)y19.a)).c(qle, bb7, (rnj$c)sz3.l);
        }
        qle.A1("includeEditControl");
        f.a(qle, bb7, (Object)sz3.m);
        qle.A1("includeCollabControlFields");
        f.a(qle, bb7, (Object)sz3.n);
        qle.A1("includeVoiceInfo");
        f.a(qle, bb7, (Object)sz3.o);
        qle.A1("includeTweetReactions");
        f.a(qle, bb7, (Object)sz3.p);
        qle.A1("includeTweetDownVote");
        f.a(qle, bb7, (Object)sz3.q);
        qle.A1("include_tweet_quick_promote_eligibility");
        f.a(qle, bb7, (Object)sz3.r);
        qle.A1("includeTrustedFriendsFields");
        f.a(qle, bb7, (Object)sz3.s);
        qle.A1("includeTweetVisibilityNudge");
        f.a(qle, bb7, (Object)sz3.t);
    }
}
