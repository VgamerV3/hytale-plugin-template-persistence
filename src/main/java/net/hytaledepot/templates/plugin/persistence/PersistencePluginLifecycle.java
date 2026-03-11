package net.hytaledepot.templates.plugin.persistence;

public enum PersistencePluginLifecycle {
  NEW,
  PRELOADING,
  SETTING_UP,
  READY,
  RUNNING,
  STOPPING,
  STOPPED,
  FAILED
}
