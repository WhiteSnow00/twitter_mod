// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.common;

import java.util.ServiceLoader;
import java.util.Iterator;
import java.util.Set;

public final class JsonModelRegistry
{
    public static boolean a;
    
    public JsonModelRegistry(final Set<Registrar> set) {
        final JsonModelRegistry.JsonModelRegistry$a jsonModelRegistry$a = new JsonModelRegistry.JsonModelRegistry$a();
        final Iterator<Registrar> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((b)jsonModelRegistry$a);
        }
    }
    
    public static void a() {
        if (((v4j)ir0.a()).E((Class)hge.class)) {
            ((hge)((v4j)ir0.a()).B((Class)hge.class)).K6();
        }
        else if (!JsonModelRegistry.a) {
            new JsonModelRegistry(nmp.r((Iterable)ServiceLoader.load(Registrar.class)));
            JsonModelRegistry.a = true;
        }
    }
    
    @ope
    public interface Registrar
    {
        void a(final b p0);
    }
    
    public interface b
    {
    }
}
