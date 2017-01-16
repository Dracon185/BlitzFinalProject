AppTitle "Final Project"

Graphics3D 1280,720
SetBuffer BackBuffer()

directory$ = "E:\Pictures\BlitzFinalProject\"

 background=LoadImage( directory + "testbackground.png")
 ResizeImage background,GraphicsWidth(),GraphicsHeight()
 test=LoadImage( directory + "testenemy.png")

While Not KeyDown(1)
 xcord=MouseX()
 ycord=MouseY()

DrawImage background,0,0
DrawImage test,220,220


Text 0,0,"X:" + xcord
Text 0,16,"Y:" + ycord

UpdateWorld
RenderWorld
Flip
Wend
End