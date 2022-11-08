import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzo extends szo
{
    public final int a;
    public final int b;
    
    public vzo(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.i("media_details");
        tfe.r0();
        tfe.T("media_source", this.a);
        tfe.T("media_type", this.b);
        tfe.h();
    }
    
    public static final class a extends h4j<vzo>
    {
        public int a;
        public int b;
        
        public final Object i() {
            return new vzo(this);
        }
    }
}
