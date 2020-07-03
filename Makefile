PROGRAM=Tpgt
SRCDIR=src
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
	BeginnerController \
	Beginnermenu.class \
	Charpanel.class \
	Cmdpanel.class \
	Controller \
	Lessonmenu.class \
	Mainwindow.class \
	Menubar.class \
	Progresspanel.class \
	Statuspanel.class \
	Textpanel.class \
	Tpgt.class \
	Worktable.class


Tpgt:
	javac -d classes -s src $(SOURCES)

run:
	java -cp classes $(PROGRAM)

clean:
	rm classes/$(CLASSES)
