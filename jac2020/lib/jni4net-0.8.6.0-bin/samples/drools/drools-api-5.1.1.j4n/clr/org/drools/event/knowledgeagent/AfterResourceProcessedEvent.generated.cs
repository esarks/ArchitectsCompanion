//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools.@event.knowledgeagent {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaClassAttribute()]
    public partial class AfterResourceProcessedEvent : global::org.drools.@event.knowledgeagent.ChangeSetProcessingEvent {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _getResource0;
        
        internal static global::net.sf.jni4net.jni.MethodId _getStatus1;
        
        internal static global::net.sf.jni4net.jni.MethodId _getResourceType2;
        
        internal static global::net.sf.jni4net.jni.MethodId @__ctorAfterResourceProcessedEvent3;
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Lorg/drools/ChangeSet;Lorg/drools/io/Resource;Lorg/drools/builder/ResourceType;L" +
            "org/drools/agent/KnowledgeAgent$ResourceStatus;)V")]
        public AfterResourceProcessedEvent(global::org.drools.ChangeSet par0, global::org.drools.io.Resource par1, global::org.drools.builder.ResourceType par2, global::java.lang.Object par3) : 
                base(((global::net.sf.jni4net.jni.JNIEnv)(null))) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 18)){
            @__env.NewObject(global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass, global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.@__ctorAfterResourceProcessedEvent3, this, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::org.drools.ChangeSet>(@__env, par0), global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::org.drools.io.Resource>(@__env, par1), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par2), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par3));
            }
        }
        
        protected AfterResourceProcessedEvent(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass;
            }
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass = @__class;
            global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getResource0 = @__env.GetMethodID(global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass, "getResource", "()Lorg/drools/io/Resource;");
            global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getStatus1 = @__env.GetMethodID(global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass, "getStatus", "()Lorg/drools/agent/KnowledgeAgent$ResourceStatus;");
            global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getResourceType2 = @__env.GetMethodID(global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass, "getResourceType", "()Lorg/drools/builder/ResourceType;");
            global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.@__ctorAfterResourceProcessedEvent3 = @__env.GetMethodID(global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent.staticClass, "<init>", "(Lorg/drools/ChangeSet;Lorg/drools/io/Resource;Lorg/drools/builder/ResourceType;L" +
                    "org/drools/agent/KnowledgeAgent$ResourceStatus;)V");
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Lorg/drools/io/Resource;")]
        public virtual global::org.drools.io.Resource getResource() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.io.Resource>(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getResource0));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Lorg/drools/agent/KnowledgeAgent$ResourceStatus;")]
        public virtual global::java.lang.Object getStatus() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::java.lang.Object>(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getStatus1));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Lorg/drools/builder/ResourceType;")]
        public virtual global::org.drools.builder.ResourceType getResourceType() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent._getResourceType2));
            }
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.@event.knowledgeagent.AfterResourceProcessedEvent(@__env);
            }
        }
    }
    #endregion
}
