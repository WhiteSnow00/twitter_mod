import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTopicsRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aut extends pue implements stb<String, bol<? extends btm<exa, zbv>>>
{
    public final cut F0;
    
    public aut(final cut f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String d = (String)o;
        e0e.f((Object)d, "searchQuery");
        final rbq a = this.F0.a;
        final JsonFetchTopicsRequestInput jsonFetchTopicsRequestInput = new JsonFetchTopicsRequestInput();
        final scs b = this.F0.b;
        jsonFetchTopicsRequestInput.a = b.b;
        jsonFetchTopicsRequestInput.b = b.a.a;
        jsonFetchTopicsRequestInput.d = d;
        jsonFetchTopicsRequestInput.e = false;
        return a.S(jsonFetchTopicsRequestInput).N();
    }
}
