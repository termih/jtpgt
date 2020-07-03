PROGRAM=Tpgt
SRCDIR=src
CLASSDIR=classes
SOURCES= \
	$(SRCDIR)/view/Beginnermenu.java \
	$(SRCDIR)/view/Charpanel.java \
	$(SRCDIR)/view/Cmdpanel.java \
	$(SRCDIR)/view/Lessonmenu.java \
	$(SRCDIR)/view/Mainwindow.java \
	$(SRCDIR)/view/Menubar.java \
	$(SRCDIR)/view/Progresspanel.java \
	$(SRCDIR)/view/Statuspanel.java \
	$(SRCDIR)/view/Textpanel.java \
	$(SRCDIR)/view/Worktable.java \
	$(SRCDIR)/controller/Controller.java \
	$(SRCDIR)/controller/BeginnerController.java \
	$(SRCDIR)/Tpgt.java

CLASSES= \
	$(CLASSDIR)/BeginnerController \
	$(CLASSDIR)/Beginnermenu.class \
	$(CLASSDIR)/Charpanel.class \
	$(CLASSDIR)/Cmdpanel.class \
	$(CLASSDIR)/Controller \
	$(CLASSDIR)/Lessonmenu.class \
	$(CLASSDIR)/Mainwindow.class \
	$(CLASSDIR)/Menubar.class \
	$(CLASSDIR)/Progresspanel.class \
	$(CLASSDIR)/Statuspanel.class \
	$(CLASSDIR)/Textpanel.class \
	$(CLASSDIR)/Tpgt.class \
	$(CLASSDIR)/Worktable.class


Tpgt:
	javac -d classes $(SOURCES)

run:
	export LANG=en_GB; java -cp classes $(PROGRAM)

clean:
	rm $(CLASSES)
