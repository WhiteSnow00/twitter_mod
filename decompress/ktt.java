import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTopicsRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ktt extends ste implements qsb<String, pnl<? extends msm<awa, kbv>>>
{
    public final mtt D0;
    
    public ktt(final mtt d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String d = (String)o;
        czd.f((Object)d, "searchQuery");
        final uaq a = this.D0.a;
        final JsonFetchTopicsRequestInput jsonFetchTopicsRequestInput = new JsonFetchTopicsRequestInput();
        final acs b = this.D0.b;
        jsonFetchTopicsRequestInput.a = b.b;
        jsonFetchTopicsRequestInput.b = b.a.a;
        jsonFetchTopicsRequestInput.d = d;
        jsonFetchTopicsRequestInput.e = false;
        return a.R((Object)jsonFetchTopicsRequestInput).N();
    }
}
