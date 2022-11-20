// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.util.Iterator;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;

public final class CollectionTypeAdapterFactory implements div
{
    public final xi6 D0;
    
    public CollectionTypeAdapterFactory(final xi6 d0) {
        this.D0 = d0;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        final Type type = blv.type;
        final Class rawType = blv.rawType;
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type g;
        final Type type2 = g = a.g(type, rawType, (Class)Collection.class);
        if (type2 instanceof WildcardType) {
            g = ((WildcardType)type2).getUpperBounds()[0];
        }
        Type type3;
        if (g instanceof ParameterizedType) {
            type3 = ((ParameterizedType)g).getActualTypeArguments()[0];
        }
        else {
            type3 = Object.class;
        }
        return (TypeAdapter<T>)new Adapter(gson, type3, (com.google.gson.TypeAdapter<Object>)gson.e(new blv(type3)), this.D0.a((blv)blv));
    }
    
    public static final class Adapter<E> extends TypeAdapter<Collection<E>>
    {
        public final TypeAdapter<E> a;
        public final o4j<? extends Collection<E>> b;
        
        public Adapter(final Gson gson, final Type type, final TypeAdapter<E> typeAdapter, final o4j<? extends Collection<E>> b) {
            this.a = new TypeAdapterRuntimeTypeWrapper<E>(gson, typeAdapter, type);
            this.b = b;
        }
        
        public final Object read(final phe phe) throws IOException {
            Object o;
            if (phe.U2() == 9) {
                phe.J2();
                o = null;
            }
            else {
                final Collection collection = (Collection)this.b.g();
                phe.a();
                while (phe.hasNext()) {
                    collection.add(this.a.read(phe));
                }
                phe.e();
                o = collection;
            }
            return o;
        }
        
        public final void write(final zke zke, Object next) throws IOException {
            final Collection collection = (Collection)next;
            if (collection == null) {
                zke.j();
            }
            else {
                zke.b();
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    next = iterator.next();
                    this.a.write(zke, next);
                }
                zke.e();
            }
        }
    }
}
