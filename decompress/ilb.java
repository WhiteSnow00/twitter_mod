import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilb
{
    public Set<ls> a;
    public Set<ls> b;
    public Set<String> c;
    public Map<String, List<ls>> d;
    
    public ilb() {
        this.a = EnumSet.noneOf(ls.class);
        this.b = EnumSet.noneOf(ls.class);
        this.c = new HashSet();
        this.d = new HashMap();
    }
    
    public static final class a
    {
        public final Set<ls> a;
        public final Set<ls> b;
        public final Set<String> c;
        public final Map<String, List<ls>> d;
        
        public a(final ilb ilb) {
            this.a = Collections.unmodifiableSet((Set<? extends ls>)EnumSet.copyOf((Collection<Enum>)ilb.a));
            this.b = Collections.unmodifiableSet((Set<? extends ls>)EnumSet.copyOf((Collection<Enum>)ilb.b));
            this.d = Collections.unmodifiableMap((Map<? extends String, ? extends List<ls>>)new HashMap<String, List<ls>>(ilb.d));
            this.c = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(ilb.c));
        }
    }
}
