import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public interface w2r
{
    String a();
    
    List<? extends b> b();
    
    List<String> c();
    
    String getId();
    
    public interface a
    {
        String a();
        
        String getId();
        
        String getName();
    }
    
    public interface b
    {
        a a();
        
        String r();
    }
}
