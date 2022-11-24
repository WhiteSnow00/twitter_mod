// 
// Decompiled by Procyon v0.6.0
// 

public final class c3k implements b3k
{
    public static final c3k.c3k$a Companion;
    public final gcu a;
    
    static {
        Companion = new c3k.c3k$a();
    }
    
    public c3k(final gcu a) {
        e0e.f((Object)a, "userPreferences");
        this.a = a;
    }
    
    public final void a() {
        this.a.i().f("people_discovery_has_collapsed_address_book_prompt", true).e();
    }
}
