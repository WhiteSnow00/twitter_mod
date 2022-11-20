import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k22
{
    public k22(final t10 t10, final trc trc, final UserIdentifier userIdentifier, final uew uew, final d4s d4s) {
        czd.f((Object)t10, "applicationManager");
        czd.f((Object)trc, "httpRequestController");
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)uew, "userManager");
        czd.f((Object)d4s, "requestFactory");
        final h5j b = ((ar0)t10).b().B();
        czd.e((Object)b, "applicationManager.lifec\u2026.observeEnterForeground()");
        final w19 w19;
        w19.c(b.doOnComplete((oj)new k22$b(w19 = new w19())).subscribe((lj6)new f$p((qsb)new k22$c(uew, userIdentifier, d4s, trc))));
    }
}
