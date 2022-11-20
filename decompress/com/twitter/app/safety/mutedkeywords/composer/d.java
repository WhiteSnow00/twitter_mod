// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safety.mutedkeywords.composer;

import android.content.res.Resources;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import com.twitter.navigation.safety.MuteKeywordComposerContentViewArgs;

public final class d extends mxh
{
    public mwh c;
    public Long d;
    public int e;
    public a f;
    public final z8r g;
    public final MuteKeywordComposerContentViewArgs h;
    
    public d(final nxh nxh, final UserIdentifier userIdentifier, final z8r g, final xbm xbm, final MuteKeywordComposerContentViewArgs h) {
        super(nxh, userIdentifier, xbm);
        this.e = 0;
        this.g = g;
        this.h = h;
        this.c = this.c();
        if (!this.f() && h.getNewKeyword() != null) {
            final mwh$a mwh$a = new mwh$a(this.c);
            mwh$a.c = h.getNewKeyword();
            this.c = (mwh)((n4j)mwh$a).e();
        }
        this.d = this.b();
    }
    
    public static String d(final Context context, final mwh mwh, final Long n) {
        final long e = mwh.e;
        final long longValue = n;
        final Resources resources = context.getResources();
        final m4s a = hq1.a;
        return bxh.a(resources, longValue + e, System.currentTimeMillis());
    }
    
    public final Long b() {
        if (this.h.getMutedKeyword() == null) {
            return this.g.a().b;
        }
        if (this.e()) {
            return -1L;
        }
        return null;
    }
    
    public final mwh c() {
        if (this.h.getMutedKeyword() != null) {
            return this.h.getMutedKeyword();
        }
        return this.g.a().a;
    }
    
    public final boolean e() {
        return this.h.getMutedKeyword() != null && this.h.getMutedKeyword().e == 0L;
    }
    
    public final boolean f() {
        return this.h.getMutedKeyword() != null;
    }
    
    public interface a
    {
    }
}
