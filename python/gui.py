import tkinter as tk

if __name__ == '__main__':    
    window = tk.Tk()
    greeting =  tk.Label(text="Hello Tkinter")
    button = tk.Button(
            text="Click me!",
            width=25,
            height=5,
            bg="blue",
            fg="yellow",
    )
    entry = tk.Entry(fg="yellow", bg="blue", width=50)
    greeting.pack()
    button.pack()
    entry.pack()
    window.mainloop()
    message = entry.get()
    print(message)
